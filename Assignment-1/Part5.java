// iterative
// time complexity: O(n)
// space complexity: O(1)
public Node reverseLinkedList(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
}

// using a stack
// time complexity: O(n)
// space complexity: O(n)
public Node reverseLinkedList(Node node) {
        Stack<Node> stack = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            stack.add(temp);
            temp = temp.next;
        }
        head = temp;
        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;
}
// recursively
// time complexity: O(n)
// space complexity: O(n)
public Node reverseLinkedList(Node node) {
        if (head == null || head.next == null) 
            return head; 
  
        Node temp = reverse(head.next); 
        head.next.next = head; 
  
        head.next = null; 
  
        return temp; 
    } 
