class Child extends Parent {
  int i;
  int j;

  public int callI(){
    return super.i;
  }

  public static void main(String[] args) {
    //System.out.println("wangshen");

    Child c = new Child();
    //System.out.println("super i = " + ((Parent)c).i);
    System.out.println("super i = " + c.callI());
    System.out.println("child i = " + c.i);
  }
}
