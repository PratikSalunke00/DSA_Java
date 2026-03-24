//Abstraction
// public class Abstraction {
//     public static void main(String[] args) {
//         Horse horse = new Horse();
//         horse.eat(); // Inherited method
//         horse.walk(); // Implemented abstract method
//         System.out.println("Horse color: " + horse.color); // Accessing inherited variable
//         horse.changeColor(); // Changing color using Horse's method
//         System.out.println("Horse color: " + horse.color); // Accessing inherited variable

//         // Chicken chicken = new Chicken();
//         // chicken.eat(); // Inherited method
//         // chicken.walk(); // Implemented abstract method
//     }
// }

// abstract class Animal{
//     String color;

//     Animal(){
//         color = "white";
//     }
//     void eat(){
//         System.out.println("Animal is eating");
//     }

//     abstract void walk();
// }

// class Horse extends Animal{
//     void changeColor(){
//         color = "brown";
//     }
//     void walk(){
//         System.out.println("Horse is walking");
//     }
// }

// class Chicken extends Animal{
//     void changeColor(){
//         color = "red";
//     }
//     void walk(){
//         System.out.println("Chicken is walking");
//     }
// }


//Constructor in abstraction
public class Abstraction {
    public static void main(String[] args) {
       Mustang myHorse = new Mustang();
       //Animal -> Horse -> Mustang
    }
}

abstract class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Animal is eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color = "brown";
    }
    void walk(){
        System.out.println("Horse is walking");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
    void changeColor(){
        color = "black";
    }
    void walk(){
        System.out.println("Mustang is walking");
    }
}