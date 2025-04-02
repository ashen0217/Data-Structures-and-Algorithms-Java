package stack;

public class stackX {
    private int top;       // Top of the stack
    private int maxSize;   // Maximum size of the stack
    private int[] stackArr; // Array to store stack elements

    // Constructor to initialize the stack with a given size
    public stackX(int size) {
        maxSize = size;
        stackArr = new int[maxSize];
        top = -1; // Initialize top to -1 (stack is empty)
    }

    // Push method to add an element to the stack
    public void push(int no) {
        if (!isFull()) {
            stackArr[++top] = no; // Increment top and add the element
        } else {
            System.out.println("Stack is full. Cannot push " + no);
        }
    }

    // Pop method to remove and return the top element of the stack
    public int pop() {
        if (!isEmpty()) {
            System.out.println();
            return stackArr[top--]; // Return the top element and decrement top
        } else {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 to indicate an empty stack
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1; // If top is -1, the stack is empty
    }

    // Method to check if the stack is full
    public boolean isFull() {
        if(top == maxSize-1){
            return true;// If top equals maxSize-1, the stack is full
        }
        else {
            return false;
        }
    }

    // Method to get the number of items in the stack
    public int getCount() {
        return top + 1; // The number of items is top + 1
    }

    // Main method for testing
    public static void main(String[] args) {
        stackX stack = new stackX(5); // Create a stack with a maximum size of 5

        // Test push and getCount
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Count after pushing 3 items: " + stack.getCount()); // Output: 3

        // Test pop and getCount
        stack.pop();
        System.out.println("Count after popping 1 item: " + stack.getCount()); // Output: 2

        // Test isEmpty and isFull
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        System.out.println("Is stack full? " + stack.isFull()); // Output: false

        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Is stack full after pushing to capacity? " + stack.isFull()); // Output: true

        // Attempt to push to a full stack
        stack.push(70); // Should print a message that the stack is full

        System.out.println("Contents of the stack:");
        while (!stack.isEmpty()) { // Continue until the stack is empty
            System.out.print(stack.pop() + " "); // Remove and display the top element
        }
        
    }

}

/* The given constructor initializes the stack with a fixed size of 10. This lacks flexibility, as every
   instance of the StackX class will have the same size. Users of the class cannot specify a custom stack
   size according to their needs, leading to either wasted memory (if the size is too large) or insufficient
   space (if the size is too small).*/