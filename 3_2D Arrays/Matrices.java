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


// Spiral Matrix
// import java.util.*;
// public class Matrices {

//     public static void printSpiral(int matrix[][]){
//         int startRow = 0;
//         int endRow = matrix.length - 1;
//         int startCol = 0;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // top borders 
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // right borders
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // bottom borders
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             // left
//             for (int i = endRow - 1; i > startRow; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startRow++;
//             endRow--;
//             startCol++;
//             endCol--;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};
//         printSpiral(matrix);    
//     }
// }


// Diagonal Sum of a Matrix
// import java.util.*;
// public class Matrices {

//     public static int diagonalSum(int matrix[][]) {
//         int sum = 0;

//         // with O(n^2) time complexity
//         // for (int i = 0; i < matrix.length; i++) {
//         //    for (int j = 0; j < matrix[0].length; j++) {
//         //         if (i == j) {
//         //             sum += matrix[i][j];
//         //         }
//         //         else if (i + j == matrix.length - 1) {
//         //             sum += matrix[i][j];
//         //         }
//         //     }
//         // }

//         // with O(n) time complexity
//         for (int i = 0; i < matrix.length; i++) {
//             // primary diagonal
//             sum += matrix[i][i]; 

//             // secondary diagonal
//             if (i != matrix.length - 1 - i) {
//                 // secondary diagonal
//                 sum += matrix[i][matrix.length - 1 - i];
//             }

//         }
                    
//         return sum;
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {{1,2,3,4},
//                           {5,6,7,8},
//                           {9,10,11,12},
//                           {13,14,15,16}};
//         System.out.println(diagonalSum(matrix));  
//     }
// }