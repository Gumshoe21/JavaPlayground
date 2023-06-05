public class Interface {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }
}

interface LivingBeing {
  int AVG_LIFESPAN = 80;

  void breathe();

  void sleep();
}

class Human implements LivingBeing {
  Boolean sleep;

  public void breathe() {
    System.out.println("I'm breathing.");
  }

  public void sleep() {
    this.sleep = true;
  }
}
