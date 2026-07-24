//Basics of ArrayList
// import java.util.ArrayList;
// public class ArrayLists{
//     public static void main(String args[]) {   
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<String> List1 = new ArrayList<>();
//         ArrayList<Boolean> List2 = new ArrayList<>();

//         //Add opration  //O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(8);
//         // list.add(1, 9); //O(n)
//         // System.out.println(list);

//         // //Get operation  //O(1)
//         // int element = list.get(2);
//         // System.out.println(element);

//         // //Remove operation  //O(n)
//         // int removeEl = list.remove(2);
//         // System.out.println(list); 

//         // //Set element at index  //O(n)
//         // list.set(2, 10);
//         // System.out.println(list); 

//         // //Contains element  //O(n)
//         // System.out.println(list.contains(1)); 
//         // System.out.println(list.contains(11)); 

//         // //Size of ArrayList
//         // System.out.println(list.size()); 

//         // //print the arraylist
//         // for(int i=0; i<list.size(); i++){
//         //     System.out.print(list.get(i) + " ");
//         // }

//         // //Reverse the ArrayList  O(n)
//         // for(int i=list.size()-1; i>=0; i--){
//         //     System.out.print(list.get(i) + " ");
//         // }


//         // //to print max of the arraylist  O(n)
//         // int max = Integer.MIN_VALUE;
//         // for(int i=0; i<list.size(); i++){
//         //     // if(list.get(i) > max){
//         //     //     max = list.get(i);
//         //     // } Or

//         //     max = Math.max(max, list.get(i));
//         // }
//         // System.out.println("Max element:" + max);
//     }
// }


//Swapping two elements in ArrayList
// import java.util.ArrayList;
// public class ArrayLists{

//     public static void swap(ArrayList<Integer> list, int idx1, int idx2){
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }

//     public static void main(String args[]) {   
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);
//         swap(list, 0, 2);
//         System.out.println(list);
//     }
// }


//Sorting an ArrayList
// import java.util.ArrayList;
// import java.util.Collections;
// public class ArrayLists{

//     public static void main(String args[]) {   
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(6);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);

//         //Sorting an ArrayList
//         Collections.sort(list);
//         System.out.println(list);

//         //reverse an ArrayList
//         Collections.reverse(list);
//         System.out.println(list);

//         Collections.sort(list, Collections.reverseOrder()); //Comparator
//         System.out.println(list);
//     }
// }


//Multidimensional ArrayList
// import java.util.ArrayList;
// public class ArrayLists{
    
//     public static void main(String args[]) {   
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        
//         ArrayList<Integer> list1 = new ArrayList<>();  //to add 1,2,3,4,5
//         ArrayList<Integer> list2 = new ArrayList<>();  //to add 2,4,6,8,10
//         ArrayList<Integer> list3 = new ArrayList<>();  //to add 3,6,9,12,15

//         for(int i=1; i<=5; i++){
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }

//         mainList.add(list1);
//         mainList.add(list2);    
//         mainList.add(list3);

//         System.out.println(mainList);

//         //To print the multidimensional arraylist
//         for(int i=0; i<mainList.size(); i++){
//             ArrayList<Integer> currList = mainList.get(i);
//             for(int j=0; j<currList.size(); j++){
//                 System.out.print(currList.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// Container with Most water
// import java.util.ArrayList;
// public class ArrayLists{
//     public static int storeWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         int lp = 0;
//         int rp = height.size()-1;

//         while(lp<rp) { //lp and rp are point to indexes
//             //calculate water area
//             int ht = Math.min(height.get(lp) , height.get(rp));
//             int width = rp-lp;
//             int currWater = ht*width;
//             maxWater = Math.max(maxWater, currWater);

//             //update ptr
//             if(height.get(lp) < height.get(rp)) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }

//         return maxWater;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> height = new ArrayList<>();
//         //1,8,6,2,5,4,8,3,7
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(storeWater(height));
//     }
// }


//Pair Sum - 1
//find if any pair in a Sorted arraylist has a target sum
// import java.util.ArrayList;
// public class ArrayLists{
//     public static boolean pairSum1(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size() - 1;

//         while(lp != rp) {
//             // case 1 
//             if(list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }

//             // case 2
//             if(list.get(lp) + list.get(rp) < target) {
//                 lp++;  
//             } else {
//                 // case 3
//                 rp--;
//             }
//         }

//         return false;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //1,2,3,4,5,6
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);

//         int target = 5;

//         System.out.println(pairSum1(list, target));
//     }
// }


//pair sum -2 
//find if any pair in a Sorted and Rotated arraylist has a target sum
// import java.util.ArrayList;
// public class ArrayLists{
//     public static boolean pairSum2(ArrayList<Integer> list, int target) {
//         int bp = -1; //break point
//         int n = list.size();
//         for(int i=0; i<list.size(); i++) {
//             if(list.get(i) > list.get(i+1)) { //breaking point
//                 bp = i;
//                 break;
//             }
//         }

//         int lp = bp+1; //smallest element index
//         int rp = bp; //largest element index

//         while(lp != rp) {
//             // case 1 
//             if(list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }

//             // case 2
//             if(list.get(lp) + list.get(rp) < target) {
//                 lp = (lp+1)%n;  
//             } else {
//                 // case 3
//                 rp = (n+rp-1)%n;
//             }
//         }
//         return false;
//     }

//     public static void main(String args[]) {
//         ArrayList<Integer> list = new ArrayList<>();
//         //11,15,6,8,9,10 sorted and rotated arraylist
//         list.add(11);
//         list.add(15);
//         list.add(6);
//         list.add(8);
//         list.add(9);
//         list.add(10);

//         int target = 16;

//         System.out.println(pairSum2(list, target));
//     }
// }


