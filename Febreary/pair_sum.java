package Febreary;

import java.util.*;

public class pair_sum {
     public static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.data = data;
               this.left = left;
               this.right = right;
          }
     }

     HashSet<Integer> set = new HashSet<>();

     public boolean findTarget(Node root, int target) {
          if (root == null)
               return false;
          if (set.contains(target - root.data))
               return true;

          set.add(root.data);
          return findTarget(root.left, target) || findTarget(root.right, target);
     }

     public static void main(String[] args) {

     }
}