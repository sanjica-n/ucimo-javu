import java.util.ArrayList;

public class UklanjaClanove {
   public static void main(String[] args)  {
      ArrayList objArray = new ArrayList();
      objArray.clear();
      objArray.add(0,"nulti član");
      objArray.add(1,"prvi član");
      objArray.add(2,"drugi član");
      System.out.println("Pre čistke članova: " + objArray);
      objArray.remove(1);
      objArray.remove("nulti član");
      System.out.println("Nakon čistke članova: " + objArray);
   }
}
