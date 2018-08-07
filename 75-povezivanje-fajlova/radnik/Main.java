public class Main 
{
    public static Sto s;
    public static Radnik pera;
    
    public static void main(String[] args) {

        s = new Sto();
        s.ime = "Sto u uglu";
        System.out.println(s.ime);
        
        pera = new Radnik("Pera Peric", 220597981, 3, 20000);
        System.out.println(pera.getIme());

        System.out.println("Plata pre povecanja: " + pera.getPlata());
        pera.povecajPlatu(20);
        System.out.println("Plata nakon povecanja: " + pera.getPlata());

    }
}
