// Superclass

class Robot {

    String name; // Instance variable - It's variable that's declared outside of any method. It's
                 // also one that doesn't public, private, etc.

    public Robot(String name) { // Constructor: public Robot(String name) Parameter: String name
        this.name = name;

        // "this.name" refers to the instance variable "name" of the Robot object
        // "name" refers to the parameter of the constructor

        // "this" a keyword in java
    }

    public void move() { // A method
        System.out.println(name + " is moving.");
    }
}

// Subclass: DriveRobot

class DriveRobot extends Robot {
    public DriveRobot(String name) { // Constructor
        super(name); // Calls the constructor of the 'Robot' class, passing the parameter 'name' to
                     // it.
        // This ensures that the 'Robot' class's constructor initializes the 'name'
        // member for the subclass objects.

    }

    public void drive() { // Method
        System.out.println(name + " is driving."); // 'name' refers to the inherited instance variable
    }

}

class ArmRobot extends Robot {
    public ArmRobot(String name) { // Constructor
        super(name); // Calls the superclass constructor and pass the parameter 'name'
    }

    public void lift() { // A method
        System.out.println(name + " is lifting an object");
    }

}

public class Inheritance {
    public static void main(String[] args) {

        DriveRobot driveRobot = new DriveRobot("TaiLung");

        ArmRobot armRobot = new ArmRobot("Shifu");

        driveRobot.move();
        driveRobot.drive();

        armRobot.lift();
        armRobot.move();
        // SuperClass: The parent class that provides methods and other attributes.
        // Subclass: The child class inheriting from the superclass.
        // Overriding: A subclass can modify or override methods from the superclass.

        // Public: Accessible by other classes
        // Private: Not accessible by other classes.

        // Ouput of the program once ran
        /*
         * TaiLung is moving.
         * TaiLung is driving.
         * Shifu is lifting an object
         * Shifu is moving.
         */
    }
}