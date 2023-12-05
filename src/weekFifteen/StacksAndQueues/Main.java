package weekFifteen.StacksAndQueues;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyStack demo = new MyStack();

        demo.push(4);
        demo.push(3);
        demo.push(2);
        demo.push(1);
        demo.push(0);

        System.out.println("Stack: "+demo.stack);
        System.out.println("Pop: "+demo.pop());
        System.out.println("Pop: "+demo.pop());
        System.out.println("Peek: "+demo.peek());
        System.out.println("Empty: "+demo.isEmpty());

    }
}
