class TestPorez {
  public static void main(String[] args){
    Porez p = new Porez(); // kreranje instance

    // dodeljivanje vrednosti članovima klase
    p.ukupanPrihod= 50000;
    p.izdrzavanaLica= 2;
    p.drzava= "NJ";

    double vasPorez = p.racunajPorez(); //određivanje poreza

    // Prikazivanje rezultata
    System.out.println("Vas porez je " + vasPorez);
  }
}
