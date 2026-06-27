//Greedy Selection
//Activity selection
// import java.util.*;
// public class GreedySelection{
//     public static void main(String args[]) {
//         int start[] = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9}; //sorted acivity

//         //for sorting process
//         int activities[] [] = new int[start.length] [3];
//         for(int i=0; i<start.length; i++) {
//             activities[i] [0] =i;
//             activities[i] [1] =start[i];
//             activities[i] [2] =end[i];
//         }

//         //lambda function-> shortform of big function
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//         //end time basis sorted
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         //1st activity
//         // maxAct = 1;
//         // ans.add(0);
//         // ans.add(activities [0][0]);
//         // int lastEnd = end[0];
//         // int lastEnd = activities[0][2];

//         // for(int i=1; i<end.length; i++) {
//         //     if(start[i] >= lastEnd) {
//         //         //activity select
//         //         maxAct++;
//         //         ans.add(i);
//         //         lastEnd = end[i];
//         //     }
//         // }

//         //for sorting process
//         maxAct = 1;
//         ans.add(activities [0][0]);
//         int lastEnd = activities[0][2];

//         for(int i=1; i<end.length; i++) {
//             if(activities[i][1] >= lastEnd) {
//                 //activity select
//                 maxAct++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }

//         System.out.println("max activities = " + maxAct);
//         for(int i=0; i<ans.size(); i++) {
//             System.out.print("A" + ans.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }


//Fractional knapsack
// import java.util.*;
// public class GreedySelection{
//     public static void main(String args[]) {
//         int val[] = {60 , 100, 120};
//         int weight[] = {10,20,30};
//         int W = 50;

//         double ratio[][] = new double[val.length][2];
//         // 0th col => idx; 1st col => ratio

//         for(int i=0; i<val.length; i++) {
//             ratio[i][0] = i;
//             ratio[i][1] = val[i]/(double)weight[i];
//         }

//         //ascending order sort
//         Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

//         int capacity = W;
//         int finalVal = 0;

//         for(int i=ratio.length-1; i>=0; i--) {
//             int idx = (int)ratio[i][0];
//             if(capacity >= weight[idx]) { //include full item
//                 finalVal += val[idx];
//                 capacity -= weight[idx];
//             } else {
//                 //include fractional item
//                 finalVal += (ratio[i][1] * capacity);
//                 capacity = 0;
//                 break;
//             }
//         }

//         System.out.println("final val =" + finalVal);
//     }
// }


//Min absolute difference pairs
// import java.util.*;
// public class GreedySelection{
//     public static void main(String args[]) {
//         int A[] = {1,2,3};
//         int B[] = {2,1,3};

//         //ascending order sort
//         Arrays.sort(A);
//         Arrays.sort(B);

//         int minDiff = 0;

//         for(int i=0; i<A.length; i++) {
//             minDiff += Math.abs(A[i] - B[i]); 
//         }
        
//         System.out.println("min absolute diff of pairs =" + minDiff);
//     }
// }


//Max length chain of pairs
// import java.util.*;
// public class GreedySelection{
//     public static void main(String args[]) {
//         int pairs[][] = {{5,24} , {39,60}, {5,28},{27,40},{50,90}};
//         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

//         int chainLen = 1;
//         int chainEnd = pairs[0][1]; //last selected pair end
        
//         for(int i=1; i<pairs.length; i++){
//             if(pairs[i][0] > chainEnd) {
//                 chainLen++;
//                 chainEnd = pairs[i][1];
//             }
//         }
//         System.out.println("max length of chain = " + chainLen);
//     }
// }


//Indian Coins
// import java.util.*;
// public class GreedySelection{
//     public static void main(String args[]) {
//         Integer coins[] = {1,2,5,10,20,50,100,500,2000};
//         Arrays.sort(coins, Comparator.reverseOrder());

//         int countOfCoins = 0;
//         int amount = 590; //last selected pair end
//         ArrayList<Integer> ans = new ArrayList<>();
        
//         for(int i=0; i<coins.length; i++){
//             if(coins[i] <= amount) {
//                 while(coins[i] <= amount ) {
//                     countOfCoins++;
//                     ans.add(coins[i]);
//                     amount -= coins[i];
//                 }
//             }
//         }
//         System.out.println("total min coins used = " + countOfCoins);

//         for(int i = 0; i<ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }


//Job sequencing Problem
// import java.util.*;
// public class GreedySelection{
//     static class Job{
//         int deadline;
//         int profit;
//         int id;

//         public Job(int i, int d, int p) {
//             id=i;
//             deadline=d;
//             profit=p;
//         }
//     }
//     public static void main(String args[]) {
//         int jobInfo[][] = {{4,20},{1,10},{1,40},{1,30}};

//         ArrayList<Job> jobs = new ArrayList<>();

//         for(int i= 0; i<jobInfo.length; i++) {
//             jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
//         }

//         Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);  //descending order sort

//         ArrayList<Integer> seq = new ArrayList<>();
//         int time =0;
//         for(int i=0; i<jobs.size(); i++) {
//             Job curr = jobs.get(i);
//             if(curr.deadline>time){
//                 seq.add(curr.id);
//                 time++;
//             }
//         }

//         System.out.println("max jobs =" + seq.size());
//         for(int i=0; i<seq.size(); i++) {
//             System.out.print( seq.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }


//Chocola Problem
import java.util.*;
public class GreedySelection{
    public static void main(String args[]) {
        int n =4 , m =6;
        Integer costVer[] = {2,1,3,1,4}; //m-1
        Integer costHor[] = {4,1,2}; //n-1

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());
        
        int hc=0, vc=0;
        int hp=1, vp=1; //because we have single piece at starting
        int cost = 0;

        while(hc < costHor.length && vc < costVer.length) {
            if(costVer[vc] <= costHor[hc]) { //Horizontal cut
                cost += (costHor[hc] * vp);
                hp++;
                hc++;
            } else {
                cost += (costVer[vc] * hp);
                vp++;
                vc++;
            }
        }

        while(hc < costHor.length) {
            cost += (costHor[hc] * vp);
            hp++;
            hc++;
        }

        while(vc < costVer.length) {
            cost += (costVer[vc] * hp);
            vp++;
            vc++;
        }
        System.out.println("min cost of cuts = " + cost);
    }
}
