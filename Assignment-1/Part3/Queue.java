import java.util.*;

public class Queue {
  List<Integer> queue = new ArrayList<>();
  // enqueue: adds an item to the queue
  public void enqueue(int item){
    queue.add(item);
  }

  // dequeue: removes an item from the queue
  public void dequeue(int item){
    if (queue.isEmpty()) {
      throw new IllegalArgumentException();
    }
    queue.remove(0);    
  }
  // rear: returns the item at the end of the queue
  public int rear() {
    if (queue.isEmpty()) {
      return -1;
    }
    return queue.get(size() - 1);
  }
  // front: returns the item at the front of the queue
  public int front() {
    if (queue.isEmpty()) {
      return -1;
    }
    return queue.get(0);
  }
  
  // size: returns the size of the queue
  public int size() {
    return queue.size();
  }
  // isEmpty: returns whether or not the queue is empty
  public boolean isEmpty() {
    return queue.isEmpty();
  }
}