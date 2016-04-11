public class TraziPodstrune {
   public static void main (String[] args) {
      String recenica = "Zdravo Svete, Zdravo Druže.";
      int lastIndex = recenica.lastIndexOf("Zdravo");
      if (lastIndex == - 1) {
         System.out.println("Zdravo nije pronađeno.");
      } else {
         System.out.println("Zdravo se poslednji put javlja na indexu " + lastIndex);
      }
   }
}
