package d3;

/**
 * Class to demo functions in java with primitive data type params.
 *
 * @author Chetan
 *
 */

// javadoc
public class FunctionsDemo {

 public static void main(String[] args) {
  int a = 2, b = 3, c = 4;
  int maxNum = getMaxNumber(a, b, c);
  System.out.println("Max of " + a + " " + b + " " + c + " is " + maxNum);
  int minNum = getMinNumber(a, b, c);
  System.out.println("Min of " + a + " " + b + " " + c + " is " + minNum);
 }

 /**
  * Method to find minimum element of the three numbers
  *
  * @param a
  * @param b
  * @param c
  * @return Returns the lowest number
  */
 private static int getMinNumber(int a, int b, int c) {
  // minimum element;

  /*
   * multi line comment
   */
  if (a < b) {
   if (a < c) {
    return a;
   } else {
    return c;
   }
  } else {
   if (b < c) {
    return b;
   } else {
    return c;
   }
  }
 }

 /**
  * Method to find max element of the three numbers
  *
  * @param p
  * @param q
  * @param myVar
  * @return Returns the highest number
  */

 static int getMaxNumber(int p, int q, int myVar) {
  // mpx element
  if (p > q) {
   if (p > myVar) {
    return p;
   } else {
    return myVar;
   }
  } else {
   if (q > myVar) {
    return q;
   } else {
    return myVar;
   }
  }
 }
}