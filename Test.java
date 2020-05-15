/**
 * Test.java created by Alex Huang
 *
 * Author:   Alex Huang (anhuang@wisc.edu)
 * Date:     @date
 * 
 * IDE:      Eclipse IDE for Java Developers
 * Version:  2018-12 (4.14.0)
 * Build ID: 20181214-0600
 * 
 */

/**
 * Test - TODO Describe purpose of this user-defined type
 * @author Huang (2020)
 *
 */
public class Test {
  public static void main (String[] args) {
    System.out.println(test000_DPR_basic());
    System.out.println(test001_DL_basic());
  }
  
  public static boolean test000_DPR_basic () {
    String case1 = D_PowerRule.differentiate("x^2");
    if (!case1.equals("2x")) {
      return false;
    }
    String case2 = D_PowerRule.differentiate("x^3");
    if (!case2.equals("3x^2")) {
      return false;
    }
    String case3 = D_PowerRule.differentiate("x^10");
    if (!case3.equals("10x^9")) {
      return false;
    }
    return true;
  }
  
  public static boolean test001_DL_basic () {
    String case1 = D_Log.differentiate("ln(x)");
    if (!case1.equals("1/x")) {
      return false;
    }
    return true;
  }
}