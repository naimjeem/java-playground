import java.util.*;
/**
 * ArrayIntro
 */
public class ArrayIntro {

  public static void main(String[] args) {
    List list = new ArrayList();

    list.add("USA");
    list.add("UK");
    list.add("UAE");
    list.add("BD");
    list.add("AUS");

    list.remove(0);          // [UK, UAE, BD, AUS]
    list.add(0, "Ireland");  // [Ireland, UK, UAE, BD, AUS]

    System.out.println(list.toString());
  }

}