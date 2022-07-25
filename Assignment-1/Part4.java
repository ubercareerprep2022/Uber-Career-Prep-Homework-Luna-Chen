import java.util.*;
public class LinkedList {
  private Node head;
  // void push(<Node node): adds the node to the end of the list
  public void push(Node node) {
    if (head == null) {
      head = node;
    }

    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = node;
  }
  
  // <Node> pop(): removes the last node at the end of the linked list, returns that data
  public Node pop() {
    Node current = head;
    while (current.next.next != null) {
      current = current.next;
    }
    Node temp = current.next;
    current.next = null;
    return temp;
  }

  // void insert(uint index, <Node> node): adds a single node containing data to a chosen location in the list. if the index is above the size of the list, do nothing
  public void insert(int index, Node node){
    if (index == 0) {
      node.next = head;
      head = node;
    } else {
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }
    Node temp = current.next;
    current.next = node;
    node.next = temp;
    }
  }

  // void remove(uint index): returns a pointer to the node at the index location in the list. if the node doesn't exist at the index, return nil/null
  public void remove(int index){
    if (index == 0) {
      head = head.next;
    }
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }
    current.next = current.next.next;
  }
  // <Node> elementAt(uint index): Returns a pointer to the node at the index location in the list. If the node doesn’t exist at the index, return nil/null
  public Node elementAt(int index) {
    if (index + 1 > size()) {
			return null;
		}
    
    Node current = head;
    for (int i = 0; i < index - 1; i++) {
      current = current.next;
    }
    return current;
  }
  
  // uint size(): returns the length of the list
  public int size() {
    Node current = head;
    int length = 0;
    while (current.next != null) {
      current = current.next;
      length++;
    }
    return length + 1;
  }

  // void printList(): Returns a string representation of the linked list
  public void printList() {
    Node current = head;
    String list = "";
    while (current.next != null) {
      list += current.data + " ";
      current = current.next;
    }
    System.out.println(list);
  }
}