class ImenovanStampac extends Thread {

  public ImenovanStampac(String name) {
    super(name);
  }

  public void run() {
    System.out.println(this.getName() + ": pocinjem!");
    for (int b = -10; b < 10; b++) {
      System.out.println(this.getName() + ": " + b);
    }
    System.out.println(this.getName() + ": gotovo!");
  }

}

