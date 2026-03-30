// Divide and Conquer
// Merge Sort
// public class DividenConquer {
//     public static void  printArr(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void mergeSort(int arr[], int si , int ei){
//         //base case
//         if(si >= ei){
//             return;
//         }

//         //kaam
//         int mid = si + (ei - si)/2; // (si + ei)/2
//         mergeSort(arr, si, mid); // left part
//         mergeSort(arr, mid+1, ei); // right part
//         merge(arr, si, mid, ei); // merge
//     }

//     public static void merge(int arr[], int si, int mid, int ei){
//         int temp[] = new int[ei - si + 1];
//         //index for left and right part
//         int i = si; // iterator left part
//         int j = mid + 1; // iterator for right part
//         int k = 0; //iterator for temp array

//         while(i <= mid && j <= ei){
//             if(arr[i] < arr[j]){
//                 temp[k] = arr[i];
//                 i++;
//                 // k++;
//             }else{
//                 temp[k] = arr[j];
//                 j++;
//                 // k++;
//             }
//             k++; // we can also write here but we have written in if and else block because we want to increase k only when we add an element in temp array
//         }

//         //left part
//         while(i <= mid){
//             // temp[k] = arr[i];
//             // i++;
//             // k++;
//             temp[k++] = arr[i++];
//         }

//         //right part
//         while(j <= ei){
//             // temp[k] = arr[j];
//             // j++;
//             // k++;
//             temp[k++] = arr[j++];
//         }

//         //copy temp to original
//         for(k = 0, i = si; k < temp.length; k++, i++){
//             arr[i] = temp[k];
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         mergeSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }


// Quick Sort
// public class DividenConquer {
//     public static void  printArr(int arr[]){
//         for(int i = 0; i < arr.length; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void quickSort(int arr[], int si, int ei){
//         //base case
//         if(si >= ei){
//             return;
//             }
//         // last element as pivot
//         int pIdx = partition(arr, si, ei);
//         //left part
//         quickSort(arr, si, pIdx-1);
//         //right part
//         quickSort(arr, pIdx+1, ei);
//     }

//     public static int partition(int arr[] , int si , int ei) {
//         int pivot = arr[ei];
//         int i = si - 1; // to track the smaller element index

//         for(int j = si; j < ei; j++){
//             if(arr[j] <= pivot){
//                 i++;
//                 //swap
//                 int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//             }
//         }
//         //swap pivot to correct position
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;
//         return i; // return pivot index
//     }

//     public static void main(String[] args) {
//         int arr[] = {6, 3, 9, 5, 2, 8};
//         quickSort(arr, 0, arr.length-1);
//         printArr(arr);
//     }
// }