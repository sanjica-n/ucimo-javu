public class PorediStrune2 {

 public static void main(String[] args) {
    String struna1 = "hello"; // String literal
    String struna2 = new String("hello"); // String object

    // poredi po referenci (jel isti objekat)
    System.out.println(struna1 == struna2);
    // poredi po vrednosti
    System.out.println(struna1.equals(struna2));
  }

}
