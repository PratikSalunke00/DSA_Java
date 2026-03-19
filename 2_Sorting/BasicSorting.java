// Bubble Sort Algorithm
// import java.util.*;
// public class BasicSorting {
//     public static void bubbleSort(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++) {
//             for(int j=0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }


// Selection Sort Algorithmimport java.util.*;
// import java.util.*;
// public class BasicSorting {
//     public static void selectionSort(int arr[]) {
//         for(int i=0; i<arr.length-1; i++) {
//             int minPos = i;
//             for(int j=i+1; j<arr.length; j++) {
//                 //find the minimum element in the unsorted array
//                 if(arr[minPos] > arr[j]) {
//                     minPos = j;
//                 }
//             }
//             // swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2 };
//         selectionSort(arr);
//         printArr(arr);
//     }
// }


// Insertion Sort Algorithm
// import java.util.*;
// public class BasicSorting {
//     public static void insertionSort(int arr[]) {
//         //Start from index 1 Because first element is already "sorted"
//         for(int i=1; i<arr.length; i++) {
//             int curr = arr[i];
//             //Start checking from left side of the current element
//             int prev = i-1;
//             // finding out the correct position to insert
//             while(prev >= 0 && arr[prev] > curr) {
//                 arr[prev+1] = arr[prev];
//                 prev--;
//             }
//             //insertion
//             //At the end of the while loop, prev will be at the position of the last element which is smaller than the current element. 
//             // So we need to insert the current element at prev+1
//             arr[prev+1] = curr;
//         }
//     }

    // public static void printArr(int arr[]) {
    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2 };
//         insertionSort(arr);
//         printArr(arr);
//     }
// }


//Inbuilt Sort Function
// import java.util.*;
// public class BasicSorting {
//     public static void main(String[] args) {
//         // int arr[] = {5, 4, 1, 3, 2 };

//         //for sorting in reverse order we need to use Integer class instead of int because Collections.
//         // reverseOrder() works with objects and not with primitive data types
//         Integer arr[] = {5, 4, 1, 3, 2 };
    
//         // Arrays.sort(arr); // sort the whole array

//         // Arrays.sort(arr,0,3); // sort from index 0 to index 2

//         Arrays.sort(arr , Collections.reverseOrder()); // sort in reverse order
        
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// Counting Sort Algorithm
// import java.util.*;
// public class BasicSorting {
//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for(int i=0; i<arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest+1];
//         for(int i=0; i<arr.length; i++) {
//             count[arr[i]]++;
//         }

//         //sorting
//         int j=0;
//         for(int i=0; i<count.length; i++) {
//             while(count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//         public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
       
//         int arr[] = {5, 4, 1, 3, 2 };
//         countingSort(arr);
//         printArr(arr);
//     }
// }
