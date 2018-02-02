import java.util.*;

/**
 * Map
 */
public class MapIntro {

  public static void main(String[] args) {
    Map gender = new HashMap();
    gender.put("Male", "John");
    gender.put("Female", "Jane");

    System.out.println("Before remove: " + gender.toString());
    try {
      gender.remove("Male");
    }
    catch (Exception e) {
      System.out.print(e);
    }
    System.out.println("After remove: " + gender.toString());
  }
}