// Tiling Problem
// You are given a floor of size 2*n. You have an infinite supply of tiles of size 2*1. 
// Count the number of ways to tile the given floor using the 2*1 tiles.
// public class Recursion2 {
//     public static int tilingProblem(int n) {// 2*n (floor size)
//         //base case
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         //kaam
//         //vertical choice
//         int fnm1 = tilingProblem(n-1);

//         //horizontal choice
//         int fnm2 = tilingProblem(n-2);

//         int totalWays = fnm1 + fnm2;
//         return totalWays;

//     }
//     public static void main(String[] args) {
//         System.out.println(tilingProblem(4));
//     }
// }


// Remove Duplicates
// public class Recursion2 {
//     public static int removeDuplicates(String str , int idx, StringBuilder newStr, boolean map[]){
//         //base case
//         if(idx == str.length()){
//             System.out.println(newStr);
//             return 1;
//         }
//         //kaam
//         char currChar = str.charAt(idx);
//         int totalCount = 0;
//         if(map[currChar - 'a'] == true){
//             //duplicate
//             totalCount += removeDuplicates(str, idx+1, newStr, map);
//         }else{
//             //not duplicate
//             map[currChar - 'a'] = true;
//             totalCount += removeDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//         return totalCount;
//     }

//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         boolean map[] = new boolean[26];
//         System.out.println(removeDuplicates(str, 0, new StringBuilder(""), map));
//     }
// }


// Friends Pairing Problem
// public class Recursion2 {
//     public static int friendsPairing(int n){
//         //base case
//         if( n == 1 || n == 2){
//             return n;
//         }
//        //choice
//        //single
//         int fnm1 = friendsPairing(n-1);

//         //pair
//         int fnm2 = friendsPairing(n-2);
//         int pairedWays = (n-1) * fnm2;

//         int totalWays = fnm1 + pairedWays;
//         return totalWays;

//         //or we can directly return without storing in variables
//         //return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
//     }

//     public static void main(String[] args) {
//         System.out.println(friendsPairing(3));
//     }
// }


// Print Binary String
// Given a number n, we need to print all binary strings of size n such that there are no consecutive 1’s in the string.
// public class Recursion2 {
//     public static void printBinaryString(int n , int lastPlace, String str){
//         //base case
//         if(n == 0){
//             System.out.println(str);
//             return;
//         }
//         //kaam
//         // if(lastPlace == 0){
//         //     //sit 0 on chair n
//         //     printBinaryString(n-1, 0, str.append("0"));
//         //     printBinaryString(n-1, 1, str.append("1"));
//         // }else{
//         //     //sit 1 on chair n
//         //     printBinaryString(n-1, 0, str.append("0"));
//         // }

//         printBinaryString(n-1, 0, str+"0");
//         if(lastPlace == 0){
//             printBinaryString(n-1, 1, str+"1");
//         }    
//     }

//     public static void main(String[] args) {
//         printBinaryString(3, 0, "");        
//     }
// }