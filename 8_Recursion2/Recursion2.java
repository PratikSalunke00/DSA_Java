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