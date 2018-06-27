public class PretraziStrunu2 {
   public static void main (String[] args) {

      String pozdrav = "Zdravo Svete, Zdravo Druže.";
      int index = pozdrav.lastIndexOf("Zdravo");

      if (index == - 1) {
         System.out.println("Rec nije pronadjena.");
      } else {
         System.out.println("Zadnje pojavljivanje reci je na indexu " + index);
      }

   }
}
