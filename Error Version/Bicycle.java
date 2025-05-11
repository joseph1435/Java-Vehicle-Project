// Bicycle.java
public class Bicycle implements Vehicle {
  // Fields (state)
  private int gear;
  private int speed;

  // Constructor
  public Bicycle(int gear, int speed) {
      this.gear = gear;
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
  public int getGear() {
      return gear;
  }
}
