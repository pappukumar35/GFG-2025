package January;

import java.util.HashMap;
import java.util.Map;

public class Close_List {
     class Node {
          int data;
          Node next;
          Node random;

          Node(int x) {
               data = x;
               next = null;
               random = null;
          }
     }

     public Node cloneLinkedList(Node head) {
          // code here
          Map<Node, Node> hm = new HashMap<>();
          Node ans = new Node(-1), curr1 = head, curr2 = ans;
          while (curr1 != null) {
               Node node = new Node(curr1.data);
               curr2.next = node;
               hm.put(curr1, node);
               curr1 = curr1.next;
               curr2 = curr2.next;
          }
          curr1 = head;
          curr2 = ans.next;
          while (curr1 != null) {
               if (curr1.random != null)
                    curr2.random = hm.get(curr1.random);
               curr1 = curr1.next;
               curr2 = curr2.next;
          }
          return ans.next;
     }

     public static void main(String[] args) {

     }
}