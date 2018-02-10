/**
 * CheckNum
 */
public class CheckNum {

  public static void main(String[] args) {
    class Number {
      int number;

      public boolean isPositive() {
        if (number >= 0) {
          return true;
        } else {
          return false;
        }
      }
    }
    Number myNumber = new Number();
    myNumber.number = -1;

    if (myNumber.isPositive()) {
      System.out.println(myNumber.number + " is Positive.");
    } else {
      System.out.println(myNumber.number + " is Negative.");
    }
  }
}