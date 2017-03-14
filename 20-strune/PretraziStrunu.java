public class PretraziStrunu {
   public static void main(String[] args) {

      String pozdrav = "Zdravo Svete";
      int index = pozdrav.indexOf("Svet");

      if (index == - 1){
         System.out.println("Rec nije pronadjena.");
      } else {
         System.out.println("Rec je pronadjena na indexu " + index);
      }

   }
}
