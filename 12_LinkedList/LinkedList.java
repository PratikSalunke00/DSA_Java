// //Basics of LinkedList
// public class LinkedList{
//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;
//     public static int size;  

//     //Methods
//     //Add first
//     public void addFirst(int data){
//         //Step 1: Create new node
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         //Step 2: newNode next = head
//         newNode.next = head; //Linking
//         //Step 3: head = newNode
//         head = newNode;
//     }

//     //Add last
//     public void addLast(int data){
//         Node newNode = new Node(data);
//         size++;
//         if(head == null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next = newNode; //Linking
//         tail = newNode;
//     }

//     //Print linked list
//     public void print(){
//         if(head == null){
//             System.out.println("LinkedList is empty");
//             return;
//         }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     //Add at any position
//     public void add(int idx, int data){
//         if(idx == 0){
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i = 0;
//         while(i < idx-1){
//             temp = temp.next;
//             i++;
//         }
//         //i = idx-1; temp -> prev
//         newNode.next = temp.next;
//         temp.next = newNode;
//     }


//     //Remove first
//     public int removeFirst(){
//         if(size == 0){
//             System.out.println("LinkedList is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         int val = head.data;
//         head = head.next;
//         size--;
//         return val;
//     }

//     //remove last
//     public int removeLast(){
//         if(size == 0){
//             System.out.println("LinkedList is empty");
//             return Integer.MIN_VALUE;
//         }
//         else if(size == 1){
//             int val = head.data;
//             head = tail = null;
//             size = 0;
//             return val;
//         }
//         //prev : i = size-2
//         Node prev = head;
//         for(int i=0; i<size-2; i++){
//             prev = prev.next;
//         }
//         int val = prev.next.data; //tail.data
//         prev.next = null;
//         tail = prev;
//         size--;
//         return val;
//     }


//     //iterative search  O(n)
//     public int itrSearch(int key){ 
//         Node temp = head;
//         int i = 0;
//         while(temp != null){
//             if(temp.data == key){
//                 return i;
//             }
//             temp = temp.next;
//             i++;
//         }
//         return -1; //key not found
//     }


//     //Recursive search
//     public int helper(Node head, int key){
//         if(head == null){
//             return -1;
//         }
//         if(head.data == key){
//             return 0;
//         }
//         int idx = helper(head.next, key);
//         if(idx == -1){
//             return -1;
//         }
//         return idx + 1;
//     }
//     public int recSearch( int key){
//         return helper(head, key);
//     }


//     //Reverse a linked list  O(n)
//     public void reverse() {
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while (curr != null) {
//             next = curr.next; // Save the next node
//             curr.next = prev; // Reverse the current node's pointer
//             prev = curr; // Move prev to the current node
//             curr = next; // Move to the next node
//         }
//         head = prev; // Update head to the new front of the list
//     }


//     //Delete nth node from last
//     public void deleteNthfromEnd(int n) {
//         //calculate size
//         int sz = 0 ; //size
//         Node temp = head;
//         while(temp != null) {
//             temp = temp.next;
//             sz++;
//         }
        
//         //to delete head
//         if(n == sz) {
//             head = head.next;
//             return;
//         }

//         // sz-n
//         int i = 1;
//         int iToFind = sz - n;
//         Node prev = head;
//         while(i < iToFind) {
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return;

//     }


//     //Find mid of linked list - Slow and fast approach
//     public Node findMid(Node head) {  //return type is Node because we want to return mid node  
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2
//         }
//         return slow; //slow is mid node
//     }

//     //palindrome linked list
//     public boolean isPalindrome() {
//         //base case
//         if(head == null || head.next == null) {
//             return true;
//         }

//         //step1 - find mid
//         Node midNode = findMid(head);

//         //step2 - reverse 2nd half
//         Node prev = null;
//         Node curr = midNode;
//         Node next;

//         while(curr != null) { //reverse logic
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node right = prev; //right half head
//         Node left = head;

//         //step3 - check left half and right half
//         while(right != null) {
//             if(left.data != right.data) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }

    
//     //dtect cycle in linked list - Floyd's cycle detection algorithm
//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2

//             if(slow == fast) {
//                 return true; //cycle exists
//             }
//         }
//         return false; //cycle does not exist
//     }


//     //remove cycle in linked list
//     public static void removeCycle() {
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2

//             if(slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if(cycle == false) {
//             return;
//         }

//         //find meeting point
//         slow = head;
//         Node prev = null; //to remove cycle
//         while(slow != fast) {  //if slow==fast -> meeting point
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }

//         //remove cycle -> last node next = null
//         prev.next = null;

//     }

//     public static void main(String args[]) {
//         // LinkedList ll = new LinkedList();
//         // ll.addFirst(2);
//         // ll.addFirst(1);
//         // ll.addLast(3);
//         // ll.addLast(4);
//         // ll.add(2, 9);
//         // ll.print(); // 1->2->9->3->4->null

//         // System.out.println(size); // 5
//         // System.out.println(ll.removeFirst()); // 1
//         // System.out.println(size); // 4
//         // ll.print(); // 2->9->3->4->null

//         // ll.removeLast();
//         // ll.print(); // 2->9->3->null
//         // System.out.println(size); // 3

//         // // System.out.println(ll.itrSearch(9)); // 1
//         // // System.out.println(ll.itrSearch(5)); // -1
//         // System.out.println(ll.recSearch(9)); // 1
//         // System.out.println(ll.recSearch(5)); // -1

//         // ll.reverse();
//         // ll.print(); // 3->9->2->null

//         //Delete nth node from last..
//         // ll.deleteNthfromEnd(2);
//         // ll.print(); // 3->2->null

//         //Palindrome linked list
//         // ll.addLast(1);
//         // ll.addLast(2);
//         // ll.addLast(2);
//         // ll.addLast(1);
//         // System.out.println(ll.isPalindrome()); // true


//         //Cycle detection in linked list
//         // head = new Node(1);
//         // head.next = new Node(2);
//         // head.next.next = new Node(3);
//         // head.next.next.next = head; //creating a cycle
//         // System.out.println(isCycle()); // true
        

//         //Remove cycle in linked list
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp; //creating a cycle

//         System.out.println(isCycle()); // true
//         removeCycle();
//         System.out.println(isCycle()); // false
//     }
// }
//.......................................................



