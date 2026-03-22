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


//Palindrome check
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