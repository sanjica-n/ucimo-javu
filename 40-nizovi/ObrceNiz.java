import java.util.ArrayList;
import java.util.Collections;

public class ObrceNiz {
   public static void main(String[] args) {

      ArrayList niz = new ArrayList();
      niz.add("A");
      niz.add("B");
      niz.add("C");
      niz.add("D");
      niz.add("E");
      System.out.println("Pre obrtanja: " + niz);
      Collections.reverse(niz);
      System.out.println("Posle obrtanja: " + niz);

   }
}
