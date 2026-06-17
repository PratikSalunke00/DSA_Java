// Stack implementation using ArrayList
import java.util.ArrayList;
public class Stack{
    static class StackArrayList{
        static ArrayList<Integer> list = new ArrayList<>();

        // Check if the stack is empty
        public static boolean isEmpty(){  //boolean return true or false
            return list.size() == 0;
        }

        // Push operation
        public static void push(int data){
            list.add(data);
        }

        // Pop operation
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek operation
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String args[]){
        StackArrayList s = new StackArrayList();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}