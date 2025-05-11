// Car.java
public class Car implements Vehicle {
  // Fields (state)
  private String model;
  private int speed;

  // Constructor
  public Car(String model, int speed) {
      this.model = model;
      this.speed = speed;
  }

  // Implementing methods from Vehicle interface
  @Override
  public void accelerate(int increment) {
      speed += increment;
  }

  @Override
  public void decelerate(int decrement) {
      speed -= decrement;
  }

  @Override
  public int getSpeed() {
      return speed;
  }

  // Other methods
  public String getModel() {
      return model;
  }
}
