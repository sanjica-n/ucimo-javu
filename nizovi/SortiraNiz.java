import java.util.Arrays;

public class SortiraNiz {

 public static void main(String args[]) throws Exception {
  int niz[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
  Arrays.sort(niz);
  stampaNiz("Sortiran niz", niz);
  int index = Arrays.binarySearch(niz, 2);
  System.out.println("Pronađen broj 2 na indexu " + index);
 }

 private static void stampaNiz(String message, int niz[]) {
   System.out.println(message + ": [length: " + niz.length + "]");
   for (int i = 0; i < niz.length; i++) {
    if (i != 0) {
     System.out.print(", ");
    }
    System.out.print(niz[i]);
   }
   System.out.println();
  } // stampaNiz

}	// SortiraNiz
