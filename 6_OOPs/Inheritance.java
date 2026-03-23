// //Single Inheritance
// public class   {
//     public static void main(String[] args) {
//         Fish shark = new Fish();
//         shark.eat();
//     }
// }

// //Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }

// //Derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }


//Multilevel Inheritance
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog labrador = new Dog();
//         labrador.eat();
//     }
// }
// //Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //Derived class
// class Mammal extends Animal{
//     int legs;
// }

// class Dog extends Mammal{
//     String breed;
// }


//Hierarchical Inheritance
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog labrador = new Dog();
//         labrador.eat();

//         Cat persian = new Cat();
//         persian.eat();
//     }
// }
// //Base class
// class Animal{
//     String color;

//     void eat(){
//         System.out.println("eats");
//     }

//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //Derived class 1
// class Dog extends Animal
// {
//     int legs;
// }
// //Derived class 2
// class Cat extends Animal{
//     String breed;
// }


//hybrid Inheritance
// public class Inheritance {
//     public static void main(String[] args) {
//         Dog labrador = new Dog();
//         labrador.eat();

//         Cat persian = new Cat();
//         persian.eat();

//         Fish shark = new Fish();
//         shark.eat();
//     }
// }
// //Base class
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathes");
//     }
// }
// //Derived class 1
// class Mammal extends Animal{
//     int legs;
// }

// //Derived class 2
// class Dog extends Mammal{
//     String breed;
// }

// class Cat extends Mammal{
//     String breed;
// }