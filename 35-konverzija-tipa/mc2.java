class mc2 {
  public static void main (String args[]) {

    double mass;
    double c = 2.998E8;  // meters/second
    double E;

    mass = Double.valueOf(args[0]).doubleValue();
    E = mass * c * c;
    System.out.println(E + " Joules");
  }
}
