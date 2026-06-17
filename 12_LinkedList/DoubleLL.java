//Double linked llist
public class DoubleLL{
    //Node class
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //remove first
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {  //prev not exist in this case
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data; //to return value of removed node
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //remove last
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {  //prev not exist in this case
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data; //to return value of removed node
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }


    public static void main(String args[]) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(1);
        dll.addFirst(2);
        dll.addFirst(3);
        dll.print();
        System.out.println("Size: " + size);

        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + size);

        dll.removeLast();
        dll.print();
        System.out.println("Size: " + size);
    }
}