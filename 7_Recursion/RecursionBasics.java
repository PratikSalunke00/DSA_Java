//Recursion Basics
//To print numbers from n to 1 using recursion
// public class RecursionBasics {
//     public static void printDec(int n) {
//         if (n == 1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.println(n);
//         // Recursive call with n-1 (it performs the looping)
//         printDec(n - 1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
//     }
// }


//To print numbers from 1 to n using recursion
// public class RecursionBasics {
//     public static void printInc(int n) {
//         if (n == 1) {
//             System.out.println(n);
//             return;
//         }
//         printInc(n - 1);
//         System.out.println(n);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         printInc(n);
//     }
// }


//To calculate the factorial of a number using recursion
// public class RecursionBasics {
//     public static int fact(int n){
//         // Base case
//         if(n == 0 ){
//             return 1;
//         }

//         //fnm1 = factorial of n-1
//         int fnm1 = fact(n-1);
//         int fn = n * fnm1;
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(fact(n));
//     }
// }


//sum of first n natural numbers using recursion
public class RecursionBasics {
    public static int sum(int n){
        // Base case
        if(n == 1){
            return 1;
        }

        //snm1 = sum of first n-1 natural numbers
        int snm1 = sum(n-1);
        int sn = n + snm1;
        return sn;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}