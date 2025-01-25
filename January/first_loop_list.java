package January;

public class first_loop_list {
     class Node {
          int data;
          Node next;
     }

     public static Node findFirstNode(Node head) {
          // code here
          if (head == null || head.next == head)
               return head;
          Node s = head, f = head;

          while (f != null && f.next != null) {
               f = f.next.next;
               s = s.next;
               if (s == f) {
                    f = head;
                    while (s != f) {
                         s = s.next;
                         f = f.next;
                    }
                    return f;
               }
          }

          return null;
     }

     public static void main(String[] args) {

     }
}