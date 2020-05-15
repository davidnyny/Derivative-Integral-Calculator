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

