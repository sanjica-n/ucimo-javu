public class Main 
{
    public static Radnik fizikalac;
    
    public static void main(String[] args) {

        fizikalac = new Radnik("Pera Peric", 220597981, 3, 20000);
        System.out.println(fizikalac.getIme());

        System.out.println("Plata pre povecanja: " + fizikalac.getPlata());
        fizikalac.povecajPlatu(20);
        System.out.println("Plata nakon povecanja: " + fizikalac.getPlata());

    }
}
