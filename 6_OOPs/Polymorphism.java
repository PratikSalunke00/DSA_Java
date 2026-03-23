//Method Overloading: 
// public class Polymorphism{
//     public static void main(String args[]) {
//         Calculator calc = new Calculator();
//         System.out.println(calc.sum(5, 10));
//         System.out.println(calc.sum(5.5f, 10.5f));
//         System.out.println(calc.sum(5, 10, 15));
//     }
// }

// class Calculator{
//     int sum(int a, int b){
//         return a+b;
//     }

//     float sum(float a, float b){
//         return a+b;
//     }

//     int sum(int a, int b, int c){
//         return a+b+c;
//     }
// }


//Method Overriding:
public class Polymorphism{
    public static void main(String args[]) {
        Dear d = new Dear();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("Dear is eating grass");
    }
}
