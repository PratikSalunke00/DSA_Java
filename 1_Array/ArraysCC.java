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
// import java.util.*;
// public class ArraysCC {
//     public static int linearSearch(int numbers[], int key) {
//         for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] == key) {
//             return i;
//            }
//         }

//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16 };
//         int key =10;

//         int index= linearSearch(numbers , key);
//         if(index == -1 ) {
//             System.out.println("NOT found");
//         }else {
//             System.out.println("key is at index:" + index);
//         }
       
//     }
// }


//To find Smallest and Largest  number
// import java.util.*;
// public class ArraysCC {
//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE; // -infinity
//         int smallest = Integer.MAX_VALUE; // +infinity

//         for(int i=0; i<numbers.length; i++) {
//            if(largest < numbers[i]) {
//             largest = numbers[i];
//            }
//            if(smallest > numbers[i]) {
//             smallest = numbers[i];
//            }
//         }
//         System.out.println("smallest value is : " + smallest);

//         return largest;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16 };
//         System.out.println("Largest value is :" + getLargest(numbers));
//     }
// }


//Binary search
// import java.util.*;
// public class ArraysCC {
//     public static int binarySearch(int numbers[], int key) {
//         int start = 0 ,  end = numbers.length-1;

//         while(start <= end) {
//             int mid = (start + end) / 2;

//             //comparison
//             if(numbers[mid] == key ) { // found
//                 return mid;
//             }
//             if(numbers[mid] < key ) { // right
//                 start = mid+1;
//             }else {//left
//                 end = mid - 1;
//             }   
//         }

//         return -1;
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16 };
//         int key = 10;

//         System.out.println("Index for key is :" + binarySearch(numbers , key));

//     }
// }

//Reverse an array
//  import java.util.*;
// public class ArraysCC {
//     public static void reverse(int numbers[]) {
//         int first= 0 ,  last = numbers.length-1;

//         while(first < last) {
//             int temp = numbers[last];
//             numbers[last] = numbers[first];
//             numbers[first] = temp;

//             first++;
//             last--;
//         }

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16 };
//         reverse(numbers);
//         for(int i = 0; i<numbers.length; i++) {
//             System.out.print(numbers[i] + " ");
//         }
//         System.out.println();
//     }
// }


//Pairs in array
// import java.util.*;
// public class ArraysCC {
//     public static void printPairs(int numbers[]) {
//         int tp =0;
//        for(int i=0; i<numbers.length; i++) {
//         int curr = numbers[i]; //2,4,6,8,10
//         for(int j=i+1; j<numbers.length; j++) {
//             System.out.print("(" + curr + "," + numbers[j] + ") ");
//             tp++;
//         }
//         System.out.println();
//        }
//         System.out.println("total pairs : " + tp);

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16 };
//         printPairs(numbers);
//     }
// }


//To print subarray
// import java.util.*;
// public class ArraysCC {
//     public static void printSubarrays(int numbers[]) {
//         int ts =0;
//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 for(int k = start; k<end; k++){ //print
//                     System.out.print(numbers[k] + " "); //subarray
//                 }
//                 ts++;
//                 System.out.println();
//         }
//         System.out.println();
//        }
//         System.out.println("total subarray : " + ts);

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         printSubarrays(numbers);
//     }
// }


//To print max subarray
// import java.util.*;
// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i; j<numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k = start; k<end; k++){ //print
//                    currSum += numbers[k];
//                 }
          
//                 System.out.println(currSum);
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//         }
      
//        }
//         System.out.println("max sum = " + maxSum);

//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         maxSubarraySum(numbers);
//     }
// }


// To print max of subarray using Prefix array
// import java.util.*;
// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         //calculate prefix array
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }

//         for(int i=0; i<numbers.length; i++) {
//             int start = i; //start of subarray
//             for(int j=i; j<numbers.length; j++) {
//                 int end =j;

//                 currSum = start ==0 ? prefix[end] : prefix[end] - prefix[start-1];

//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         System.out.println("max sum = " + maxSum);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {1,-2,6,-1,3};
//         maxSubarraySum(numbers);
//     }  
// }


// To print max of subarray using kadanes algorithm
// import java.util.*;
// public class ArraysCC {
//     public static void kadanes(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs =0;

//         for(int i=0; i<numbers.length; i++) {
//             cs = cs+ numbers[i];
//             if(cs<0) {
//                 cs=0;
//             }
//             ms = Math.max(cs,ms);
//         }

//         System.out.println("our max subarray sum is :" +ms);
//     }

//     public static void main(String args[]) {
//         int numbers[] = {-2,-3,4,-1,-2,1,15,-4};
//         kadanes(numbers);
//     }  
// }


// Trapping of Rain Water 22 no. problem in DSA sheet
// import java.util.*;
//O(n) will be TC for this code
// public class ArraysCC{
//     public static int trappedRainWater(int height[]) {
//         int n = height.length;
//         //to calculate left max boundry -> array
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for(int i=1; i<n; i++) {
//             leftMax[i] = Math.max(height[i] , leftMax[i-1]);
//         }

//         //to calculate right max boundry -> array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i= n-2; i>=0; i--) {
//             rightMax[i] = Math.max(height[i] , rightMax[i+1]);
//         }

//         int trappedWater = 0;
//         //loop
//         for(int i=0; i<n; i++) {
//             //waterLevel = min(leftmax bound , rightmax boundry)
//             int waterLevel = Math.min(leftMax[i] , rightMax[i]);
            
//             //trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }
//         return trappedWater;
//     }

//     public static void main(String args[]) {
//         int height[] = {4,2,0,6,3,2,5};
//         System.out.println( trappedRainWater(height));
//     }
// }


//Buy and Sell Stocks
// import java.util.*;

// public class ArraysCC {
//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice < prices[i]) { //profit
//                 int profit = prices[i] - buyPrice; //todays profit
//                 maxProfit = Math.max(maxProfit , profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit;
//     }

//     public static void main(String args[]) {
//         int prices[] = {7,1,5,3,6,4};
//         System.out.println(buyAndSellStocks(prices));
//     }
// }