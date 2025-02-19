package Febreary;

import java.util.List;
import java.util.PriorityQueue;

public class merger {

     public static class Node {
          int data;
          Node left;
          Node right;
          Node List;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     Node mergeKLists(List<Node> arr) {
          // Add your code here.
          Node res = new Node(-1);
          PriorityQueue<Integer> q = new PriorityQueue<>();

          for (Node n : arr) {
               while (n != null) {
                    q.add(n.data);
                    n = n.next;
               }
          }

          Node temp = res;
          while (!q.isEmpty()) {
               Node node = new Node(q.remove());
               temp.next = node;
               temp = temp.next;
          }

          return res.next;
     }

     public static void main(String[] args) {

     }
}