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
// public class RecursionBasics {
//     public static int sum(int n){
//         // Base case
//         if(n == 1){
//             return 1;
//         }

//         //snm1 = sum of first n-1 natural numbers
//         int snm1 = sum(n-1);
//         int sn = n + snm1;
//         return sn;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sum(n));
//     }
// }


//To calculate the nth Fibonacci number using recursion
// public class RecursionBasics {
//     public static int fib(int n){
//         // Base case
//         if(n==0 || n==1){
//             return n;
//         }

//         //fnm1 = fib of n-1
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }

//     public static void main(String[] args) {
//         int n = 25;
//         System.out.println(fib(n));
//     }
// }


//To check if an array is sorted or not using recursion
// public class RecursionBasics {
//     public static boolean isSorted(int arr[], int i){
//         // Base case
//         if(i == arr.length-1){
//             return true;
//         }

//         if(arr[i] > arr[i+1]){
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }

//     public static void main(String[] args) {
//         // int arr[] = {1, 7, 6, 4, 5};
//         int arr[] = {1, 2, 3, 4, 5};
//         System.out.println(isSorted(arr, 0));
//     }
// }


//To find the first occurrence of a key in an array using recursion
// public class RecursionBasics {
//     public static int firstOcc(int arr[], int key, int i){
//         // Base case
//         if(i == arr.length){
//             return -1;
//         }

//         if(arr[i] == key){
//             return i;
//         }

//         return firstOcc(arr, key, i+1);
//     }

//     public static void main(String[] args) {
//         int arr[] = {1, 2, 3, 4, 5, 2, 7};
//         System.out.println(firstOcc(arr, 5, 0));
//     }
// }


//
public class RecursionBasics {
    public static int firstOcc(int arr[], int key, int i){
        // Base case
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return firstOcc(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 2, 7};
        System.out.println(firstOcc(arr, 5, 0));
    }
}