import java.util.Arrays;

public class PorediNizove {
   public static void main(String[] args) {

      int[] niz1 = {1,2,3,4,5,6};
      int[] niz2 = {1,2,3,4,5,6};
      int[] niz3 = {1,2,3,4};

      System.out.println("Jel niz 1 jednak nizu 2? " + Arrays.equals(niz1, niz2));
      System.out.println("Jel niz 1 jednak nizu 3? " + Arrays.equals(niz1, niz3));

   }
}
