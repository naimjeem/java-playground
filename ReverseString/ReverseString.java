public class ReverseString {
  public static void main(String[] args) {
    String string = "It is a String";
    String reverseString = new StringBuffer(string).reverse().toString();
    System.out.println("String Length: " + string.length());
    System.out.println("Reversed String: " + reverseString);
  }
}