//Strings in Java
//Strings are a sequence of characters.
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         char arr[] = {'h', 'e', 'l', 'l', 'o'};
//         String str = "abcd";
//         String str2 = new String("abcd");

//         //Strings are immutable in java

//         Scanner sc = new Scanner(System.in);
//         String name ;
//         name = sc.nextLine();
//         System.out.println(name);
//     }
// }


//Functions of String class
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         System.out.println(str.length()); //length of the string
//         System.out.println(str.charAt(0)); //character at index 0
//         System.out.println(str.indexOf('o')); //index of first occurrence of 'o'
//         System.out.println(str.lastIndexOf('o')); //index of last occurrence of 'o'
//         System.out.println(str.substring(0, 5)); //substring from index 0 to 5
//         System.out.println(str.toUpperCase()); //convert to uppercase
//         System.out.println(str.toLowerCase()); //convert to lowercase
//         System.out.println(str.trim()); //remove leading and trailing spaces
//         System.out.println(str.replace('o', 'a')); //replace 'o' with 'a'
//     }
// }


//Concatenation of strings
// import java.util.*;
// public class Strings {
//     public static void main(String[] args) {
//         String str1 = "Hello";
//         String str2 = "World";
//         //concatenation using + operator
//         String str3 = str1 + " " + str2; 
//         System.out.println(str3);

//         //concatenation using concat() method
//         String str4 = str1.concat(" ").concat(str2); 
//         System.out.println(str4);
//     }
// }


// Palindrome check
// import java.util.*;
// public class Strings {
//     public static boolean isPalindrome(String str) {
//         for(int i=0; i<str.length()/2; i++) {
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n-1-i)) {
//                 //not a palindrome
//                 return false;
//             }
//         }
//         //palindrome
//         return true; 
//     }
//     public static void main(String[] args) {
//         String str = "racecar";
//         String str2 = "hello";
//         System.out.println(isPalindrome(str));
//         System.out.println(isPalindrome(str2));
//     }
// }



//Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination "WNEENESENNN" from origin (0, 0).
// In such problems, each direction (E, W, N, S) is implicitly assumed to be 1 unit move.
// 👉 This is a standard convention in:
// Grid problems
// Coordinate geometry
// Pathfinding questions
// import java.util.*;
// public class Strings {
//     public static float getShortestPath(String path) {
//         int x=0 , y=0;
//         for(int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             //East
//             if(dir == 'E') {
//                 x++;
//             } 
//             //West
//             else if(dir == 'W') {
//                 x--;
//             } 
//             // North
//             else if(dir == 'N') {
//                 y++;
//             } 
//             // South
//             else if(dir == 'S') {
//                 y--;
//             }
//         }

//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);
//     }

//     public static void main(String args[]) {
//         String path = "WNEENESENNN";
//         System.out.println(getShortestPath(path));
//     }  
// }


//String comparison
// 👉 == checks memory location (reference)
// 👉 .equals() checks actual value (content)
// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         String s1 = "Virat";
//         String s2 = "Virat";
//         String s3 = new String("Virat");

//         //In Java, string literals are interned, meaning that they refer to the same memory location if they have the same content.
//         // if(s1 == s2) {
//         //     System.out.println("s1 and s2 are same");
//         // } else {
//         //     System.out.println("s1 and s2 are different");
//         // }

//         // // However, when you create a string using the new keyword, it creates a new object in memory,
//         // // even if the content is the same.
//         // // Therefore, s1 and s3 will not refer to the same memory location.
//         // if(s1 == s3) {
//         //     System.out.println("s1 and s2 are same");
//         // } else {
//         //     System.out.println("s1 and s2 are different");
//         // }

//         // To compare the content of strings, you should use the equals() method,
//         //  which checks for value equality rather than reference equality. 
//         if(s1.equals(s3)) {
//             System.out.println("s1 and s3 are same");
//         } else {
//             System.out.println("s1 and s3 are different");
//         }
//     }
// }


//String Function - substring
// import java.util.*;
// public class Strings{
//     // public static String substring(String str, int si, int ei){
//     //    //substring from index si to ei-1
//     //     String substr = "";
//     //     for(int i=si; i<ei; i++) {
//     //         substr += str.charAt(i);
//     //     }
//     //     return substr;
//     // }

//     public static void main(String args[]){
//         //substring from index 0 to 5
//         String str = "Hello World";
//         // System.out.println(substring(str, 0, 5));
//         System.out.println(str.substring(0, 5));
//     }
// }


//Find the largest string in an array of strings
// import java.util.*;
// public class Strings{
//     public static void main(String args[]){
//         String fruits[] = {"Apple", "Mango", "Banana"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++) {
//             if(largest.compareTo(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }