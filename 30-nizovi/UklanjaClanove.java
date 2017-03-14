import java.util.ArrayList;

public class UklanjaClanove {
   public static void main(String[] args)  {

      ArrayList lista = new ArrayList();

      lista.add(0,"nulti član");
      lista.add(1,"prvi član");
      lista.add(2,"drugi član");
      System.out.println("Pre čistke članova: " + lista);

      lista.remove("nulti član");
      lista.remove(1);
      System.out.println("Nakon čistke članova: " + lista);

   }
}
