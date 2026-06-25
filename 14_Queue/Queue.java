//Basics of Queue
//Oueue using Array
// import java.util.*;
// public class Queue{
//     static class QueueB{
//         static int arr[];
//         static int size;
//         static int rear;

//         QueueB(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         //add
//         public static void add(int data) {
//             if(rear == size - 1){
//                 System.out.println("queue is full");
//                 return;
//             }

//             rear = rear + 1;
//             arr[rear] =data;

//         }

//         //remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear = rear-1;

//             return front;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[0];
//         }
//     }

//     public static void main(String args[]) {
//         QueueB q = new QueueB(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Circular queue using array
// import java.util.*;
// public class Queue{
//     static class QueueB{
//         static int arr[];
//         static int size;
//         static int rear;
//         static int front;

//         QueueB(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//             front = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1 && front == -1;
//         }

//         //check queue is full 
//         public static boolean isFull() {
//             return (rear+1) % size == front;
//         }

//         //add
//         public static void add(int data) {
//             if(isFull()){
//                 System.out.println("queue is full");
//                 return;
//             }

//             //add 1st element
//             if(front == -1) {
//                 front = 0;
//             }

//             rear = (rear + 1 ) % size;
//             arr[rear] =data;
//         }

//         //remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int result = arr[front];
//             //when last el delete
//             if(rear == front) {
//                 rear = front = -1;
//             }else{
//                 front =(front + 1) % size;
//             }
//             return result;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return arr[front];
//         }
//     }

//     public static void main(String args[]) {
//         QueueB q = new QueueB(3);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Queue using Linked List
// import java.util.*;
// public class Queue{
//     static class Node{
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class QueueB{
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         //add
//         public static void add(int data) {
//             Node newNode =  new Node(data);
//             if(head == null) {
//                 head = tail = newNode;
//                 return;
//             }
//             tail.next = newNode;
//             tail = newNode; //changed tail
//         }

//         //remove 
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             int front = head.data;
//             //single el
//             if(tail == head) {
//                 tail = head = null;
//             }else{
//                 head = head.next;
//             }
//             return front;
//         }

//          //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty queue");
//                 return -1;
//             }

//             return head.data;
//         }
//     }

//     public static void main(String args[]) {
//         QueueB q = new QueueB();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Queue using java collection framework
// import java.util.*;
// public class Queue{

//     public static void main(String args[]) {
//         // QueueB q = new QueueB();
//         // java.util.Queue<Integer> q = new LinkedList<>(); //queue is interface his obj cannot be made
//         // or using ArrayDeque()
//         java.util.Queue<Integer> q = new ArrayDeque<>(); 
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Queue using two stack
//Push O(n)
// import java.util.*;
// public class Queue{
//     static class QueueB{
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         //add
//         public static void add(int data) {
//             while(!isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }

//         //remove
//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("queue empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }

//     public static void main(String args[]) {
//         QueueB q = new QueueB();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


//Stack using 2 Queues
//Pop O(n)
// import java.util.*;
// public class Queue{
//     static class Stack{
//         static java.util.Queue<Integer> q1 = new LinkedList<>();
//         static java.util.Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void push(int data) {
//             if(!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         //pop
//         public static int pop() {
//             if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             //case 1 - all el in q1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     if(q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else { //case 2 - all el in q2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         //peek
//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("empty stack");
//                 return -1;
//             }
//             int top = -1;

//             //case 1 - all el in q1
//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
                    
//                     q2.add(top);
//                 }
//             } else { //case 2 - all el in q2
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
                   
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }

//     public static void main(String args[]) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


//First non-repeating letter in a stream of characters
// import java.util.*;
// public class Queue{
//     public static void printNonRepeating(String str) {
//         int freq[] = new int[26]; //'a'-'z'
//         java.util.Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch - 'a'] ++;

//             while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1+ " ");
//             } else {
//                 System.out.print(q.peek()+ " "); 
//             }
//         }
//     }

//     public static void main(String args[]) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }


//Interleaves 2 Halves of a Queue
// import java.util.*;
// public class Queue {
//     public static void interLeave(java.util.Queue<Integer> q){
//         java.util.Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }

//     public static void main(String args[]) {
//         java.util.Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interLeave(q);
//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }


//Queue Reversal - 
// import java.util.*;
// public class Queue{
//     public static void reverse(java.util.Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }
//     public static void main(String args[]) {
//         java.util.Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reverse(q);

//         //print Q
//         while(!q.isEmpty()) {
//             System.out.print(q.remove()+ " ");
//         }

//         System.out.println();
//     }
// }
//...................................................


//Deque
import java.util.*;
public class Queue{
    public static void main(String args[]) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);//2 1

        deque.removeFirst();
        System.out.println(deque);//1

        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);

        System.out.println("first el = " + deque.getFirst());
        System.out.println("last el = " + deque.getLast());
    }
}