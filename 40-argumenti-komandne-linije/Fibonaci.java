class Fibonaci {

  public static void main (String args[]) {
    int manji = 0;
    int veci = 1;
    int limit = args.length > 0 ? Integer.parseInt(args[0]) : 50;

    System.out.println(manji);

    while (veci < limit) {
      System.out.println(veci);
      int temp = veci;
      veci = veci + manji;
      manji = temp;
    }
  }
}
