package January;

import java.util.*;

public class Delete_List {
     static class Node {
          int data;
          Node next;
     }

     public static boolean deleteLoop(Node head) {
          Node slow = head;
          Node fast = head;
          while (fast != null && fast.next != null) {
               slow = slow.next;
               fast = fast.next.next;
          }
          if (slow == fast) {
               return true;
          }
          return false;
     }

     public static void main(String[] args) {

     }
}