public class ViseIzuzetaka2 {

  public static void main(String[] args) {

    int repeat;

    try {
      // mogucnost pojave NumberFormatException i ArrayIndexOutOfBoundsException
      repeat = Integer.parseInt(args[0]);

      // mogucnost pojave ArithmeticException
      int n = 2/repeat;

      // mogucnost pojave StringIndexOutOfBoundsException
      String s = args[0].substring(5);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      //odabiremo default vrijednost
      repeat = 1;
    }
    catch (NumberFormatException e) {
      // ispisujemo poruku o pogreski
      System.err.println("Pozivanje: java ViseIzuzetaka2 broj_ponavljanja" );
      System.err.println("npr. java ViseIzuzetaka2 5" );
      return;
    }
    catch (Exception e) {
      // ispisujemo poruku o pogreski i izlazimo
      System.err.println("Neocekivana iznimka");
      e.printStackTrace();
      return;
    }

    for (int i = 0; i < repeat; i++) {
      System.out.println("Zdravo");
    }

  }

}
