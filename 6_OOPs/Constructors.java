 
// public class Constructors {
//     public static void main(String args[]){
//         Student s1 = new Student();
//         Student s2 = new Student("Pratik");
//         Student s3 = new Student(123);
//     }
// }

// class Student {
//     //object properties
//     String name;
//     int roll;

//     //Default Constructor
//     Student() {
//         System.out.println("Constructor is called...");
//     }

//     // Parameterized Constructor
//     Student(String name) {
//         // this keyword is used to refer to the current object
//         this.name = name;
//     }

//     // Copy Constructor
//     Student(Student s) {
//         this.name = s.name;
//         this.roll = s.roll;
//     }
// }


//Copy Constructor
public class  Constructors {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Pratik";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 90;
        s1.marks[1] = 80;   
        s1.marks[2] = 70;

        Student s2 = new Student(s1);
        s2.password = "xyz"; // changing the password of s1 will not affect s2 as they are different objects
        // changing the marks of s1 will affect s2 as they are pointing to the same array in memory
        s1.marks[0] = 100;
        for(int i=0; i<3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    //object properties
    String name;
    int roll;
    String password;
    int marks[];

    // shallow Copy Constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     // this will create a shallow copy of the marks array, both s1 and s2 will point to the same array in memory
    //     this.marks = s1.marks; 
    // }

    // Deep Copy Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        // this will create a deep copy of the marks array, both s1 and s2 will point to different arrays in memory
        for(int i=0; i<3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    //Default Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    // Parameterized Constructor
    Student(String name) {
        // this keyword is used to refer to the current object
        marks = new int[3];
        this.name = name;
    }

    // Copy Constructor
    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
} 