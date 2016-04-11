public class PorediStrune{
   public static void main(String args[]){
      String velikaSlova = "Zdravo Svete";
      String malaSlova = "zdravo svete";
      Object strunaObjekat = velikaSlova;

			// returns the ascii difference of first odd characters of compared strings
      System.out.println( velikaSlova.compareTo(malaSlova) );
      System.out.println( velikaSlova.compareToIgnoreCase(malaSlova) );
      System.out.println( velikaSlova.compareTo(strunaObjekat.toString()));
   }
}
