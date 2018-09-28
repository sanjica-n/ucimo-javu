import java.io.*;

public class EfikasniEho {

  public static void odjek(InputStream ulaz) {
    try {
      while (true) {
        int n = ulaz.available();
        if (n > 0) {
          byte[] b = new byte[n];
          int rezultat = ulaz.read(b);
          if (rezultat == -1) break;
          String s = new String(b);
          System.out.print(s);
        } // if   
      } // while
    } // try
    catch (IOException e) {
      System.err.println(e);
    }
  }

  public static void main(String[] args) {
    odjek(System.in);
  }
}
