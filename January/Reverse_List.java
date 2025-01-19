package January;

import java.util.*;

public class Reverse_List {
     class Node {
          int data;
          Node next;

          Node(int d) {
               data = d;
               next = null;
          }
     }

     public Node rotate(Node head, int k) {
          // add code here
          int size = 0;
          Node head1 = head;
          Node prev = null;
          while (head1 != null) {
               prev = head1;
               head1 = head1.next;
               size++;
          }
          k = k % size;
          while (k-- > 0) {
               Node temp = head.next;
               prev.next = head;
               prev = prev.next;
               head.next = null;
               head = temp;

          }
          return head;
     }

     public static void main(String[] args) {

     }
}