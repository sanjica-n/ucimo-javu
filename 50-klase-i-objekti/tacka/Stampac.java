class Koordinata {
  double x;
  double y;
}

class Stampac {
  public static void main(String[] args) {
    Koordinata ishodiste;         // deklariramo tocku ishodiste
    Koordinata jedan;             // deklariramo tocku jedan
    ishodiste = new Koordinata(); // alociramo ishodiste pomocu konstruktora klase
    jedan = new Koordinata();     // alociramo jedan pomocu konstruktora klase
    // postavljamo vrijednosti atributa
    ishodiste.x = 0.0;
    ishodiste.y = 0.0;
    jedan.x = 1.0;
    jedan.y = 0.0;
    // ispisujemo koordinate ovih dviju tocaka
    System.out.println("Ishodiste ima koordinate " + ishodiste.x + ", " + ishodiste.y);
    System.out.println("Tocka jedan ima koordinate " + jedan.x + ", " + jedan.y);
  }
}
