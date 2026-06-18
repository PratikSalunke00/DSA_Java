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
import java.util.*;
public class Stack{

    public static void main(String args[]){
        // StackLinkedList s = new StackLinkedList();
        // Stack<Integer> s = new Stack<>();  //this comment because my folder have same Stack file ,
        //  but this is main method of java collections framework
        
        java.util.Stack<Integer> s = new java.util.Stack<>();  //this use because my folder have same Stack file
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}