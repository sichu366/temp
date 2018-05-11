class Child extends Parent {
  //int i;
  int j;

  public int getSuperI(){
    return super.i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public int getI(){
    return this.i;
  }



  public static void main(String[] args) {
    //System.out.println("wangshen");

    Child c = new Child();
    //System.out.println("super i = " + ((Parent)c).i);
    System.out.println("super i = " + c.getSuperI());
    c.setI(4);
    System.out.println("child i = " + c.getI());
    System.out.println("super i = " + c.getSuperI());
  }
}
