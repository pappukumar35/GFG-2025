package April;

import java.util.HashSet;
import java.util.Set;

public class length {
     public int countNodesinLoop(Node head) {
          // code here.S
          Set<Node> set = new HashSet<>();
          Node curr = null;

          while (head != null) {
               if (set.contains(head)) {
                    curr = head;
                    break;
               }
               set.add(head);
               head = head.next;
          }

          if (curr == null)
               return 0;

          Node temp = curr;
          curr = curr.next;

          int count = 0;
          while (curr != temp) {
               count++;
               curr = curr.next;
          }
          return count + 1;

     }

     public static void main(String[] args) {

     }
}