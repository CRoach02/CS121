package weekFifteen.StacksAndQueues;

import java.util.ArrayList;

public class MyStack {
    ArrayList<Integer> stack = new ArrayList<>();

    public void push(int element){
        stack.add(element);
    }
    public int pop(){
        if(stack.isEmpty()){
            isEmpty();
        }else{
            stack.remove(stack.size()-1);
        }
        return stack.get(stack.size()-1);
    }
    public int peek(){
        if(stack.isEmpty()){
            isEmpty();
        }return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        if (!stack.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
