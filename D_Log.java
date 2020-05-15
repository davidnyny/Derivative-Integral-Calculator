/**
 * D_Log.java created by Alex Huang
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
 * D_Log - This class performs the derivative on the input log function. The input must be in the
 * basic log form (no chain rule and no coefficients).
 * @author Huang (2020)
 *
 */
public class D_Log {
  public static String differentiate(String input) {
    int parenthIndex = input.indexOf("(");
    return "1/" + input.substring(parenthIndex+1, parenthIndex+2);
  }
}