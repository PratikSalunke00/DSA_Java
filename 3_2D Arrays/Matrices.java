// 2D Arrays - Matrices
// import java.util.*;
// public class Matrices {
//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j <matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("Key found at index (" + i + ", " + j + ")");
//                     //returning true if key is found in the matrix
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found in the matrix");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;

//         // input
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         // output
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         search(matrix, 5);
//     }
// }