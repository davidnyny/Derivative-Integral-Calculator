import java.util.*;
public class Separator
{
    private String exp;
    private ArrayList<String> splits = new ArrayList<String>();

    public Separator(String expression){
        expression.replaceAll("\\s+","");
        exp = expression;
    }

    //Separates the mathematical expression (accounts for parentheses)
    public void separation(){
        String str[] = exp.split("[\\-+)(]");
        //temp arraylist with spaces in it
        List<String> sp = new ArrayList<String>();
        sp = Arrays.asList(str);
        for(int i = 0; i<sp.size(); i++){
            if(!sp.get(i).equals("")){
                splits.add(sp.get(i));
            }
        }
    }

    //Delegates the expressions into their rule classes
    public void delegation(){
        for(int i = 0; i < splits.size(); i++){
            boolean checker = false;
            boolean check2 = false;
            String c = splits.get(i);
            if (c.contains("cos") == true)checker = true;
            else if (c.contains("sin") == true)checker = true;
            else if (c.contains("tan") == true)checker = true;
            else if (c.contains("sec") == true)checker = true;
            else if (c.contains("csc") == true)checker = true;
            else if (c.contains("cot") == true)checker = true;
            else if (c.contains("log") == true)checker = true;
            else if (c.contains("ln") == true)checker = true;
            else if (c.contains("x") == true){
                for (int j = splits.get(i).indexOf("x") + 1; j < splits.get(i).length(); j++){
                    if (splits.get(i).charAt(j) == ('x'))check2 = true;
                }
            }

            if(checker != true && check2 != true){
                I_PowerRule ipr = new I_PowerRule();
                D_PowerRule dpr = new D_PowerRule();
                dpr.differentiate(c);
                ipr.integrate(c);
            }
        }
    }

    //Checks the precedence of the operator
    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
            return 1;
            case '*':
            case '/':
            return 2;
            case '^':
            return 3;
        }
        return -1;
    }
}
