
import java.util.Scanner;

class Stack {
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    // Pop method
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value);
            return value;
        }
    }

    // Peek method
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // isEmpty method
    public boolean isEmpty() {
        return (top == -1);
    }

    // isFull method
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Display stack elements
    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
class StackUsingArray{
    // Main method to test the Stack implementation
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();

        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Check if stack is full");
            System.out.println("6. Display stack");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int peekValue = stack.peek();
                    if (peekValue != -1) {
                        System.out.println("Peeked value: " + peekValue);
                    }
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Stack is not empty");
                    }
                    break;
                case 5:
                    if (stack.isFull()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Stack is not full");
                    }
                    break;
                case 6:
                    stack.displayStack();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}

