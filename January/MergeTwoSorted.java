package January;

import java.util.*;

public class MergeTwoSorted {
     class Node {
          int data;
          Node next;

          Node(int d) {
               data = d;
               next = null;
          }
     }

     Node sortedMerge(Node head1, Node head2) {
          // code here
          Node newHead = new Node(-1);
          Node dummy = newHead;
          while (head1 != null && head2 != null) {
               if (head1.data <= head2.data) {
                    newHead.next = head1;
                    head1 = head1.next;
               } else {
                    newHead.next = head2;
                    head2 = head2.next;
               }
               newHead = newHead.next;
          }
          while (head1 != null) {
               newHead.next = head1;
               newHead = newHead.next;
               head1 = head1.next;
          }
          while (head2 != null) {
               newHead.next = head2;
               newHead = newHead.next;
               head2 = head2.next;
          }
          return dummy.next;

     }

     public static void main(String[] args) {

     }
}