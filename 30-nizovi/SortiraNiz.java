import java.util.Arrays;

public class SortiraNiz {

 public static void main(String args[]) {
  int niz[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
  int trazeniBroj = 5;
  print("Nesortiran niz", niz);
  Arrays.sort(niz);
  print("Sortiran niz", niz);
  int index = Arrays.binarySearch(niz, trazeniBroj);
  System.out.println("Traženi broj " + trazeniBroj + " je na indexu " + index);
 }

 private static void print(String uvod, int niz[]) {
   System.out.println(uvod + ": [duzine: " + niz.length + "]");
   for (int i = 0; i < niz.length; i++) {
    System.out.print(niz[i]);
    System.out.print(" ");
   }
   System.out.println();
  }

}
