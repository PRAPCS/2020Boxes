class Main {
  public static void main(String[] args) {
    
    Boxes b1 = new Boxes();
    Boxes b2 = new Boxes();
    Boxes b3 = new Boxes(2,4,6);
    Boxes b4 = new Boxes(10,20,30);

    System.out.println(b1.getVolume());
    System.out.println(b2.getVolume());
    System.out.println(b3.getVolume());
    System.out.println(b4.getVolume());

    System.out.println(b2.getLength());
    b2.setLength(100);
    System.out.println(b2.getLength());
    System.out.println();
  }
}