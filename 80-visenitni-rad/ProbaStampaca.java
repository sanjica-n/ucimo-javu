class StampacBrojeva extends Thread {

  public void run() {
    System.out.println("pocinjem!");
    for (int b = -10; b < 10; b++) {
      System.out.println(b);
    }
    System.out.println("gotovo!");
  }

}


class ProbaStampaca {

  public static void main(String args[]) {

    StampacBrojeva stampac1 = new StampacBrojeva();
    StampacBrojeva stampac2 = new StampacBrojeva();
    StampacBrojeva stampac3 = new StampacBrojeva();
    stampac1.start();
    stampac2.start();
    stampac3.start();

  }

}
