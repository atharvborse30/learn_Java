/*
 * A practical example of abstraction can be motorbike brakes. We know what brake does. When we apply the brake, the motorbike will stop. However, the working of the brake is kept hidden from us.

The major advantage of hiding the working of the brake is that now the manufacturer can implement brake differently for different motorbikes, however, what brake does will be the same.
 */

 abstract class MotorBike {
    abstract void brake();
  }
  
  class SportsBike extends MotorBike {
      
    // implementation of abstract method
    public void brake() {
      System.out.println("SportsBike Brake");
    }
  }
  
  class MountainBike extends MotorBike {
      
    // implementation of abstract method
    public void brake() {
      System.out.println("MountainBike Brake");
    }
  }
  
  class java_abstraction {
    public static void main(String[] args) {
      MountainBike m1 = new MountainBike();
      m1.brake();
      SportsBike s1 = new SportsBike();
      s1.brake();
    }
  }
