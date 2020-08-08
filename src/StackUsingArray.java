//Implement a stack using an Array
class Stack {
    public static final int MAX = 1000;
    int top;
    int[] array = new int[MAX];

    Stack() {
        top = -1;
    }

    boolean isStackEmpty() {
        return (top < 0);
    }

    boolean push(int x) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            array[++top] = x;
            System.out.println("Pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            int x = array[top--];
            return x;
        }

    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop() + " Popped");
        System.out.println(stack.isStackEmpty());

    }


}
