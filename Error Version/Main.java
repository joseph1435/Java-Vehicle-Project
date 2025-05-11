// Main.java
public class Main {
  public static void main(String[] args) {
      // Create objects of Car and Bicycle
      Vehicle myCar = new Car("Toyota", 0);
      Vehicle myBicycle = new Bicycle(5, 0);

      // Test the Car object
      myCar.accelerate(50);
      System.out.println("Car Speed: " + myCar.getSpeed());

      // Test the Bicycle object
      myBicycle.accelerate(10);
      System.out.println("Bicycle Speed: " + myBicycle.getSpeed());
  }
}
