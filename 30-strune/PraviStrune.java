public class PraviStrune {

 public static void main(String[] args) {
    // String literals
    String struna1 = "hello";
    // String objects with 'new' keyword
    String struna2 = new String("hello");

    // reference equality (whether they are the same object)
    System.out.println(struna1 == struna2);
    // value equality
    System.out.println(struna1.equals(struna2));
  }

}
