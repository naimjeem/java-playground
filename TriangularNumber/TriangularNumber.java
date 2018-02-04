import java.util.Scanner;

/**
 * TriangularNumber
 */
public class TriangularNumber {

  public static void main(String[] args) {
    int starting_number = 1;
    int ending_number = 10;

    System.out.println("List of Triangular Numbers ");
    for (int i = starting_number; i <= ending_number; i++) {
        int triangular = 0;


        for (int j = 1; j <= i; j++) {
            triangular = triangular + j;
        }
        System.out.println(i + " => " + triangular);
    }
  }
}