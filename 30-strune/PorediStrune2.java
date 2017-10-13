public class PorediStrune2 {

 public static void main(String[] args) {
    String struna1 = "hello"; // String literal
    String struna2 = new String("hello"); // String object

    // reference equality (are the same object)
    System.out.println(struna1 == struna2);
    // value equality
    System.out.println(struna1.equals(struna2));
  }

}
