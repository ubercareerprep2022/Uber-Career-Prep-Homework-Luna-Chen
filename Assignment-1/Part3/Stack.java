import java.util.*;

public class Stack {
  List<Integer> stack= new ArrayList<>();
  
  // push: pushes an integer on top of the stack
  public void push(int num) {
    stack.add(num);
  }
  
  // pop: removes what is on top of the stack, and returns that value to the caller
  public int pop() {
    if (stack.isEmpty()){
      return -1;
    }
    int topVal = top();
    stack.remove(size() - 1);
    return topVal;
  }

  // top: looks at the top value, and returns it. does not manipulate the stack
  public int top() {
    if (stack.isEmpty()){
      return -1;
    }

    int topVal = stack.size() - 1;
    return stack.get(topVal);
  }

  // isEmpty: returns true or false if the stack is empty or not respectively
  public boolean isEmpty() {
    return stack.isEmpty();
  }

  // size: returns an int value with the count of the elements in the stack
  public int size() {
    return stack.size();
  }
}