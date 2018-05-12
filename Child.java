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

  public void printAge(){
    System.out.println("Siying is 0 years old");
  }

  public void getSuperPrint(){
    super.printAge();
  }

  public void runSuperExe(){
    super.exe();
  }





  public static void main(String[] args) {
    //System.out.println("wangshen");

    Child c = new Child();
    Parent p = new Child();
    p.exe();
    //System.out.println("super i = " + ((Parent)c).i);
    System.out.println("super i = " + c.getSuperI());
    c.setI(4);
    System.out.println("child i = " + c.getI());
    System.out.println("super i = " + c.getSuperI());
    c.getSuperPrint();
    c.runSuperExe();
  }
}
