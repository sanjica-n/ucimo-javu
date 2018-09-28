import java.io.*;

public class Eho {

  public static void odjek(InputStream ulaz) {
    try {
      while (true) {
        int broj = ulaz.read();   // cita bajt i vraca broj izmedju 0 i 255
        if (broj == -1) break;

        char znak = (char) broj;  // pretvara broj u znak
        System.out.print(znak);    
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
  }

  public static void main(String[] args) {
    odjek(System.in);
  }
}
