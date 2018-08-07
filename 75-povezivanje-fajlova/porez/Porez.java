class Porez {
  double ukupanPrihod;
  String drzava;
  int izdrzavanaLica;

  public double racunajPorez() {
    double stateTax = 0;
    if (ukupanPrihod < 30000) {
      stateTax = ukupanPrihod * 0.05;
    }
    else {
      stateTax = ukupanPrihod * 0.06;
    }
    return stateTax;
  }
}
