// To printing marks using an array
// import java.util.*;

// public class ArraysCC {
//     public static void main(String args[]) {
//         int marks[] = new int[100];

//         Scanner sc = new Scanner(System.in);

//          System.out.println("length:" + marks.length);

//         marks[0] = sc.nextInt();
//         marks[1] = sc.nextInt();
//         marks[2] = sc.nextInt();
        
//         System.out.println("phy:" + marks[0] );
//         System.out.println("chem:" + marks[1] );
//         System.out.println("math:" + marks[2] );

//         // marks[2] = 100;
//         // marks[2] = marks[2] +1;
//         // System.out.println("math:" + marks[2] );

//         int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         System.out.println("percentage=" + percentage+ "%" );
//     }
// }


//Passing arrays as argument
//Arrays pass by Reference
// import java.util.*;
// public class ArraysCC {
//     public static void update(int marks[]) {
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] +1 ;
//         }
//     }
//     public static void main(String args[]){
//         int marks[] = {97, 98 ,99 };
//         update(marks);

//         for(int i = 0; i<marks.length ; i++) {
//             System.out.print(marks[i] + " ");
//         }
//           System.out.println();
//     }
// }


//Linear Search
import java.util.*;
public class ArraysCC {
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
           if(numbers[i] == key) {
            return i;
           }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16 };
        int key =10;

        int index= linearSearch(numbers , key);
        if(index == -1 ) {
            System.out.println("NOT found");
        }else {
            System.out.println("key is at index:" + index);
        }
       
    }
}