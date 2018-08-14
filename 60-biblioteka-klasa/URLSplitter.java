public class URLSplitter {

  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      try {
        java.net.URL u = new java.net.URL(args[i]);
        System.out.println("Protocol: " + u.getProtocol());
        System.out.println("Host: " + u.getHost());
        System.out.println("Port: " + u.getPort());
        System.out.println("File: " + u.getFile());
        System.out.println("Ref: " + u.getRef());
      }
      catch (java.net.MalformedURLException e) {
        System.err.println(args[i] + " nije valjani URL");
      }
    }

  }

}
