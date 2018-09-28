public class ViseIzuzetaka {
  public static void main(String[] args) {

    int repeat;

    try {
      repeat = Integer.parseInt(args[0]);
    }
    catch (ArrayIndexOutOfBoundsException e) {
      //odabiremo default vrijednost
      repeat = 1;
    }
    catch (NumberFormatException e) {
      // ispisujemo poruku o pogreski
      System.err.println("Pokretanje: java ViseIzuzetaka broj" );
      System.err.println("npr. java ViseIzuzetaka 5" );
      return;
    }

    for (int i = 0; i < repeat; i++) {
      System.out.println("Zdravo");
    }

  }
}
