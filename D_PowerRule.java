/**
 * D_PowerRule.java created by Alex Huang
 *
 * Author:	 Alex Huang (anhuang@wisc.edu)
 * Date: 	 @date
 *  
 * IDE:		 Eclipse IDE for Java Developers
 * Version:	 2018-12 (4.14.0)
 * Build ID: 20181214-0600
 *
 */

/**
 * D_PowerRule - This class performs a derivative power rule operation on the input. The input
 * must be a unit function (all coefficients removed)
 * @author Huang (2020)
 *
 */
public class D_PowerRule {
  public static String differentiate(String input) {
    String derivative = "";
    if (!input.contains("^")) {
      derivative = derivative.replace("x", "");
      return derivative;
    }
    else {
      int expIndex = input.indexOf("^");
      int exponent = Integer.parseInt(input.substring(expIndex+1));
      if (exponent == 2) {
        derivative = exponent + input.substring(0, expIndex);
      }
      else {
        derivative = exponent + input.substring(0, expIndex+1) + (exponent-1);
      }
    }
    return derivative;
  }
}