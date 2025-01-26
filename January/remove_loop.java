package January;

import java.util.*;

public class remove_loop {
     static class Node {
          int data;
          Node next;
     }

     public static void removeLoop(Node head) {
          // code here
          Node slow = head;
          Node fast = head;

          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;

               if (slow == fast) {
                    slow = head;
                    while (slow != fast) {
                         slow = slow.next;
                         fast = fast.next;
                    }
                    Node last = slow;

                    while (last.next != fast) {
                         last = last.next;
                    }
                    last.next = null;
               }
          }
     }

     public static void main(String[] args) {

     }
}