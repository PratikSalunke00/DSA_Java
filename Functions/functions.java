//***** To print Hello World ****
/*
import java.util.*;
public class functions {
    public static void printHellWorld() {
        System.out.println("Hello World");
    }

    public static void main(String args[]) {
        printHellWorld();
    }
}
*/


// **** To print sum using function with parameter ****
/*
import java.util.*;
public class functions {
    public static void calSum(int num1 , int num2) {
        int sum = num1 + num2;
        System.out.println("Sum is :" + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calSum(a , b);
    }
}
*/

/*
import java.util.*;
public class functions {
    public static int calSum(int num1 , int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a , b); //arguments or actual parameters
        System.out.println("Sum is : " +""+ sum);
    } 
}
*/


// **** call by value Example ****
/*
import java.util.*;
public class functions {
    public static void swap(int a , int b) { //parameters or formal parameters
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        swap(a , b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    } 
}
*/


// **** To find Product of a & b ****
/*
import java.util.*;
public class functions {
    public static int multiply(int num1 , int num2) { //parameters or formal parameters
        int mul = num1 * num2;
        return mul;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = multiply(a , b); //arguments or actual parameters
        System.out.println("Multiplication  is : " +""+ mul);
    } 
}
*/


// **** To find Factorial of a number , n ****
/*
import java.util.*;
public class functions {
    public static int factorial(int n){
        int f = 1;

        for( int i= 1; i<=n; i++) {
            f = f*i;
        }

        return f; // factorial of n
    }
    public static void main(String args[]) {
        System.out.println(factorial(7));
    } 
}
*/


// **** Binomial Coefficient ****
/*
import java.util.*;
public class functions {
    public static int factorial(int n){
        int f = 1;

        for( int i= 1; i<=n; i++) {
            f = f*i;
        }

        return f; // factorial of n
    }

    public static int binoCoe(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binoCoe = fact_n / (fact_r * fact_nmr);
        return binoCoe;
    }

    public static void main(String args[]) {
        System.out.println(binoCoe(5 ,2));
    } 
}
*/


// **** To find the sum of numbers using functions(using parameters) ****
/*
import java.util.*;
public class functions {
    public static int sum(int a , int b) {
        return a+b;
    }
    
    public static int sum(int a , int b , int c) {
        return a+b+c;
    }

    public static void main(String args[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,5,6));
    } 
}
*/


// **** To find the sum of numbers using functions(using data types) ****
/*
import java.util.*;
public class functions {
    public static int sum(int a , int b) {
        return a+b;
    }

    public static float sum(float a , float b) {
        return a+b;
    }

    public static void main(String args[]) {
        System.out.println(sum(3,5));
        System.out.println(sum(3.6f , 7.8f));
    } 
}
*/


// **** To check if a number is Prime or not ****
/*
import java.util.*;
public class functions {
    public static boolean isPrime(int n){
        for( int i=2; i<=n-1; i++) {
           if(n % == 0) {
            return false;
           }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(5));
    } 
}
*/


// **** To check if a number is Prime or not (using optimized approach) ****
/*
import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(7));
    } 
}
*/


// **** To check if a number is Prime or not (using optimized approach) ****
/*
import java.util.*;
public class functions {
    public static boolean isPrime(int n) {
        if(n==2) {
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void primesInRange(int n) {
        for(int i=2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        primesInRange(20);
    } 
}
*/


// **** To convert a number from binary to decimal ****
/*
import java.util.*;
public class functions {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("decimal of " + myNum+ " =" + decNum);
    }

    public static void main(String args[]) {
        binToDec(101);
    } 
}
*/


// **** To convert a number from decimal to binary ****
/*
import java.util.*;
public class functions {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while(decNum> 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));

            pow++;
            decNum = decNum/2;
        }

        System.out.println("binary of " + myNum+ " =" + binNum);
    }

    public static void main(String args[]) {
        decToBin(12);
    } 
}
*/


// **** FUNCTIONS QUESTIONS ****

// Question 1 :Write a Java method to compute the averageof three numbers.
/*
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double x = sc.nextDouble();

        System.out.print("Input the second number: ");
        double y = sc.nextDouble();

        System.out.print("Input the third number: ");
        double z = sc.nextDouble();

        System.out.println("The average value is " + average(x, y, z));
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }
}
*/

//