// Stack implementation using ArrayList
// import java.util.ArrayList;
// public class Stack{
//     static class StackArrayList{
//         static ArrayList<Integer> list = new ArrayList<>();

//         // Check if the stack is empty
//         public static boolean isEmpty(){  //boolean return true or false
//             return list.size() == 0;
//         }

//         // Push operation
//         public static void push(int data){
//             list.add(data);
//         }

//         // Pop operation
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = list.get(list.size() - 1);
//             list.remove(list.size() - 1);
//             return top;
//         }

//         // Peek operation
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return list.get(list.size() - 1);
//         }
//     }

//     public static void main(String args[]){
//         StackArrayList s = new StackArrayList();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// Stack implementation using Linked List
// import java.util.ArrayList;
// public class Stack{
//     static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
    
//     static class StackLinkedList{
//         static Node head = null;

//         // Check if the stack is empty
//         public static boolean isEmpty(){  //boolean return true or false
//             return head == null;
//         }

//         //push
//         public static void push(int data){
//             Node newNode = new Node(data);
//             if(isEmpty()){
//                 head = newNode;
//                 return;
//             }
//             newNode.next = head;
//             head = newNode;
//         }

//         //pop
//         public static int pop(){
//             if(isEmpty()){
//                 return -1;
//             }
//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         //peek
//         public static int peek(){
//             if(isEmpty()){
//                 return -1;
//             }
//             return head.data;
//         }
//     }

//     public static void main(String args[]){
//         StackLinkedList s = new StackLinkedList();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
//...................................................


//Stack using java collections framework
// import java.util.*;
// public class Stack{

//     public static void main(String args[]){
//         // StackLinkedList s = new StackLinkedList();
//         // Stack<Integer> s = new Stack<>();  //this comment because my folder have same Stack file ,
//         //  but this is main method of java collections framework
        
//         java.util.Stack<Integer> s = new java.util.Stack<>();  //this use because my folder have same Stack file
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while(!s.isEmpty()){
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//Question 1 : Push at the bottom of stack ...
// import java.util.*;

// public class Stack{
//     public static void pushAtBottom(java.util.Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void main(String args[]) {
//         java.util.Stack<Integer> s = new java.util.Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         pushAtBottom(s, 4);
//         while(!s.isEmpty()){ //to check the stack after push at bottom and now print by peek and pop
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//Question 2 : Reverse a string using stack
//  import java.util.*;
// public class Stack{
//     public static String reverseString(String str) {
//         java.util.Stack<Character> s = new java.util.Stack<>();
//         int idx = 0;
//         while(idx<str.length()){
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()){
//             char curr = s.pop();
//             result.append(curr);
//         }

//         str = result.toString();
//         return str;
//     }

//     public static void main(String args[]) {
//         String str = "Hello";
//         str = reverseString(str);
//         System.out.println(str);
//     }
// }


//Question 3 : reverse a stack using recursion
//  import java.util.*;
// public class Stack{
//     public static void pushAtBottom(java.util.Stack<Integer> s, int data){
//         if(s.isEmpty()){
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }

//     public static void reverseStack(java.util.Stack<Integer> s){
//         if(s.isEmpty()){
//             return;
//         }
//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }

//     public static void printStack(java.util.Stack<Integer> s){
//         while(!s.isEmpty()){
//             System.out.println(s.pop());
//         }
//     }

//     public static void main(String args[]) {
//         java.util.Stack<Integer> s = new java.util.Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3); //3->2->1

//         reverseStack(s);
//         printStack(s); //1->2->3
//     }
// }


//Stack Span Problem
// import java.util.*;
// public class Stack{
//     public static void stockSpan(int stocks[] , int span[]) {
//         java.util.Stack<Integer> s= new java.util.Stack<>();
//         span[0] = 1;
//         s.push(o); //span of 0 is always 1

//         //to check everydays span
//         for(int i=1; i<stocks.length; i++) {
//             int currPrice = stocks[i];

//             //to find prevHigh than currPrice so ,
//             // first remove small prices idxes to reach to prevHigh
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
//                 s.pop();
//             }

//             if(s.isEmpty()){
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] =i-prevHigh;
//             }

//             //or apne idx ko stack me push kar denge jiska span find kiya
//             s.push(i);
//         }
//     }

//     public static void main(String args[]) {
//         int stocks[]  = {100,80,60,70,60,85,100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++) {
//             System.out.println(span[i]+ " ");
//         }
//     }
// }


//Question 5 : Next Greater Element
// import java.util.*;
// public class Stack{
//     public static void main(String args[]) {
//         int arr[] = {6,8,0,1,3};
//         java.util.Stack<Integer> s = new java.util.Stack<>();
//         int nextGreater[] = new int[arr.length];

//         for(int i=arr.length-1; i>=0; i--) {
//             //1 while
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }

//             //2 if-else
//             if(s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }

//             //3 push
//             s.push(i);
//         }

        
//         for(int j=0; j<nextGreater.length; j++) {
//             System.out.print(nextGreater[j]+ " ");
//         }

//         System.out.println();
//     }
// }


//Valid Parentheses
// import java.util.*;
// public class Stack {
//     public static boolean isValid(String str) {
//         java.util.Stack<Character> s = new java.util.Stack<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             //Opening parentheses
//             if(ch == '(' || ch == '{' || ch == '[') {
//                 s.push(ch);
//             } else {
//                 //Closing parentheses
//                 if(s.isEmpty()) {
//                     return false;
//                 }
//                 if((ch == ')' && s.peek() != '(')
//                  || (ch == '}' && s.peek() != '{')
//                  || (ch == ']' && s.peek() != '[')) {
//                     return false;
//                 }
//                 s.pop();
//             }
//         }
//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String args[]) {
//         String str = "({[]})";
//         System.out.println(isValid(str));
//     }
// }


//Question 7 : Duplicate Parentheses
import java.util.*;
public class Stack{
    public static boolean isDuplicate(String str) {
        java.util.Stack<Character> s = new java.util.Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ')') {
                int count = 0;
                while(!s.isEmpty() && s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true;
                } else {
                    s.pop(); //pop opening bracket
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        String str = "((a+b))"; //true
        String str1 = "(a+b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));
    }
}