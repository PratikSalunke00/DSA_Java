//Basics of ArrayList
import java.util.ArrayList;
public class ArrayLists{
    public static void main(String args[]) {   
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> List1 = new ArrayList<>();
        ArrayList<Boolean> List2 = new ArrayList<>();

        //Add opration  //O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1, 9); //O(n)
        System.out.println(list);

        //Get operation  //O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove operation  //O(n)
        int removeEl = list.remove(2);
        System.out.println(list); 

        //Set element at index  //O(n)
        list.set(2, 10);
        System.out.println(list); 

        //Contains element  //O(n)
        System.out.println(list.contains(1)); 
        System.out.println(list.contains(11)); 

        //Size of ArrayList
        System.out.println(list.size()); 

        //print the arraylist
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        //Reverse the ArrayList  O(n)
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}


