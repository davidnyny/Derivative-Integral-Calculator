/**
 * I_PowerRule.java created by Alex Huang and David Nygren
 *
 * Author:	 Alex Huang and David Nygren (anhuang@wisc.edu and davnygren@gmail.com)
 * Date: 	 5/14/2020
 *
 */

/**
 * I_PowerRule - This class performs an integral power rule operation on the input. The input
 * must be a unit function (all coefficients removed)
 *
 */
public class I_PowerRule {
  public static String integrate(String input) {
    String integral = "";
    if (!input.contains("^")) {
      integral = integral.replace("x", "");
      return integral;
    }
    else {
      int expIndex = input.indexOf("^");
      int exponent = Integer.parseInt(input.substring(expIndex+1));
      integral = "(" + input.substring(0,expIndex) + "/" + (exponent+1) + ")" + input.substring(expIndex,expIndex+1) + (exponent + 1);
    }
    return integral;
  }
}
