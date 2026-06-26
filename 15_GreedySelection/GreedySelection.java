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
import java.util.*;
public class GreedySelection{
    public static void main(String args[]) {
        int val[] = {60 , 100, 120};
        int weight[] = {10,20,30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col => idx; 1st col => ratio

        for(int i=0; i<val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        //ascending order sort
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for(int i=ratio.length-1; i>=0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) { //include full item
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                //include fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("final val =" + finalVal);
    }
}
