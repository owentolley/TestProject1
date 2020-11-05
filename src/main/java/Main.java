import java.util.*;

public class Main {

    public static void main(String[] args) {

        Stack <String> myStack = new Stack<>();

        myStack.push("Owen");
        myStack.push("Yudeer");
        myStack.push("Jake");

        System.out.println(myStack.peek());
        myStack.pop();
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack);


    }
}
