import java.util.*;

class Main {
  public static void main(String[] args) {
    Stack myStack = new Stack();
    myStack.push(42);
    System.out.println("Top of stack: " + myStack.top());
    System.out.println("Size of stack: " + myStack.size());
    int popped_value = myStack.pop();
    System.out.println("Popped value: " + popped_value);
    System.out.println("Size of stack: " + myStack.size());
    Queue myQueue = new Queue();
    myQueue.enqueue(1);
    myQueue.enqueue(2);
    myQueue.enqueue(3);
    System.out.println("Size of queue: " + myQueue.size());
  }
}
