import java.util.Random;

/**
 * RandomNumber
 */
public class RandomNumber {

  public static void main(String[] args) {
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(11) + 10;
    
    System.out.print(randomNumber);
  }
}