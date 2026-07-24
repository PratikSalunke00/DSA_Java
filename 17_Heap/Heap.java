// Basics of Priority Queue in Java
import java.util.PriorityQueue;
public class Heap {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank; // Ascending order based on rank
        }
    }

    public static void main(String[] args) {
        // Create a priority queue (min-heap)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);
        pq.add(9);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}