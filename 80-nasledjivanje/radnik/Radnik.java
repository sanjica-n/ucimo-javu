class Radnik extends Covek {

  public int staz;
  public double plata;
  
  public Radnik(String i, long id, int s, double p) {
      super(i, id);
      staz = s;
      plata = p;
  }
  
  public int getStaz() {
      return staz;
  }
  
  public double getPlata() {
      return plata;
  }
  
  public void povecajPlatu(double procenat) {
      plata += plata * procenat / 100;
  }
  
}
