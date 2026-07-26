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

import java.util.PriorityQueue;
public class Heap {
    static class Student implements Comparable<Student> { //Override the compareTo() method by the Student class to define the natural ordering of Student objects
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override //this method is used to compare two Student objects based on their rank
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Ascending order based on rank
        }
    }

     public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A",4));
        pq.add(new Student("B",2));
        pq.add(new Student("C",8));
        pq.add(new Student("D",1));
        pq.add(new Student("E",9));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}