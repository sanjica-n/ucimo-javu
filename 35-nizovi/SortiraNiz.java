import java.util.Arrays;

public class SortiraNiz {

 public static void main(String args[]) {
  int niz[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
  int trazeniBroj = 5;

  stampajNiz("Nesortiran niz", niz);
  Arrays.sort(niz);
  stampajNiz("Sortiran niz", niz);
 }

 private static void stampajNiz(String opis, int niz[]) {
   System.out.println(opis + ": [duzine: " + niz.length + "]");
   for (int i = 0; i < niz.length; i++) {
    System.out.print(niz[i]);
    System.out.print(" ");
   }
   System.out.println();
  }

}
