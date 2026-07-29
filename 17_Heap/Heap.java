// Basics of Priority Queue in Java
// import java.util.PriorityQueue;
// public class Heap {
//     public static void main(String[] args) {
//         // Create a priority queue (min-heap)
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         pq.add(5);
//         pq.add(2);
//         pq.add(8);
//         pq.add(1);
//         pq.add(9);

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }


// to store objects in a priority queue, we need to implement the 
// Comparable interface in the class of the object. 
// The compareTo() method is used to define the natural ordering of the objects.

// import java.util.PriorityQueue;
// public class Heap {
//     static class Student implements Comparable<Student> { //Override the compareTo() method by the Student class to define the natural ordering of Student objects
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override //this method is used to compare two Student objects based on their rank
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank; // Ascending order based on rank
//         }
//     }

//      public static void main(String[] args) {
//         PriorityQueue<Student> pq = new PriorityQueue<>();

//         pq.add(new Student("A",4));
//         pq.add(new Student("B",2));
//         pq.add(new Student("C",8));
//         pq.add(new Student("D",1));
//         pq.add(new Student("E",9));

//         while (!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " " + pq.peek().rank);
//             pq.remove();
//         }
//     }
// }


//To insert in heap
// import java.util.*;
// public class Heap{
//     static class Heaps {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {
//             //add at last idx
//             arr.add(data);
//             int x= arr.size()-1; //x is child index  // array use length and arraylist use size() method to get the size of the arraylist
//             int par = (x-1)/2; //parent index

//             while(arr.get(x) < arr.get(par)) {
//                 //swap
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         //get min
//         public int peek() {
//             return arr.get(0);
//         }

//         public void heapify(int i){
//             int left = 2*i + 1;
//             int right = 2*i + 2;
//             int minIdx = i;
            
//             if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
//                 minIdx = right;
//             }

//             if(minIdx != i) {
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);
//                 heapify(minIdx);
//             }
//         }

//         public int remove() {
//             int data = arr.get(0);
//             //step1: swap first and last
//             int temp = arr.get(0);
//             arr.set(0, arr.get(arr.size()-1));
//             arr.set(arr.size()-1, temp);

//             //step2: delete last
//             arr.remove(arr.size()-1);

//             //step3: heapify
//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size() == 0;
//         }
//     }

//     public static void main(String args[]) {
//         Heaps h = new Heaps();
//         h.add(3);
//         h.add(4); 
//         h.add(1);  
//         h.add(5);
//         while(!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }
// }


//Heap Sort
import java.util.*;
public class Heap{
    public static void heapify(int arr[] , int i,  int size) {
        int left = 2*i + 1;
        int right = 2*i + 2;
        int maxIdx = i;

        if(left < size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        if(right < size && arr[maxIdx] < arr[right]) {
            maxIdx = right;
        }

        if(maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
    }
    public static void heapSort(int arr[]) {
        //step1-build maxHeap
        int n = arr.length;
        for(int i=n/2; i>=0; i--) {
            heapify(arr, i, n);
        }

        //step2 - push largest eng
        for(int i=n-1; i>0; i--) {
            //swap
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,2,4,5,3};
        heapSort(arr);
        
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}