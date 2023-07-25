import java.util.Stack;

public class StackImplementation {
    public static void main(String[] args) {
        // Stack Implemntation 1: Stack<E> class extends Vector<E> class, hence we can have all the methods of List
        // and also methods like peek, pop, push, etc which are common for Stack
        Stack<Integer> myStack = new Stack<>();
        myStack.add(1);myStack.add(12);myStack.add(21);myStack.add(14);
        System.out.println(myStack);
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }
    }
}
