//Basics of LinkedList
public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;  

    //Methods
    //Add first
    public void addFirst(int data){
        //Step 1: Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //Step 2: newNode next = head
        newNode.next = head; //Linking
        //Step 3: head = newNode
        head = newNode;
    }

    //Add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode; //Linking
        tail = newNode;
    }

    //Print linked list
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //Add at any position
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }


    //Remove first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }


    //iterative search  O(n)
    public int itrSearch(int key){ 
        Node temp = head;
        int i = 0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; //key not found
    }


    //Recursive search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx + 1;
    }
    public int recSearch( int key){
        return helper(head, key);
    }


    //Reverse a linked list  O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next; // Save the next node
            curr.next = prev; // Reverse the current node's pointer
            prev = curr; // Move prev to the current node
            curr = next; // Move to the next node
        }
        head = prev; // Update head to the new front of the list
    }


    //Delete nth node from last
    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0 ; //size
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        
        //to delete head
        if(n == sz) {
            head = head.next;
            return;
        }

        // sz-n
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print(); // 1->2->9->3->4->null

        // System.out.println(size); // 5
        // System.out.println(ll.removeFirst()); // 1
        // System.out.println(size); // 4
        // ll.print(); // 2->9->3->4->null

        // ll.removeLast();
        // ll.print(); // 2->9->3->null
        // System.out.println(size); // 3

        // // System.out.println(ll.itrSearch(9)); // 1
        // // System.out.println(ll.itrSearch(5)); // -1
        // System.out.println(ll.recSearch(9)); // 1
        // System.out.println(ll.recSearch(5)); // -1

        // ll.reverse();
        // ll.print(); // 3->9->2->null

        //Delete nth node from last..
        ll.deleteNthfromEnd(2);
        ll.print(); // 3->2->null
    }
}

