package Febreary;

import java.util.ArrayList;
import java.util.Collections;

public class fixed_bst {
     static class Node {
          int data;
          Node left;
          Node right;

          Node(int data) {
               this.left = left;
               this.right = right;
          }
     }

     void correctBST(Node root) {
          // code here.
          ArrayList<Integer> list = new ArrayList<>();
          inOrder(list, root);
          ArrayList<Integer> list1 = new ArrayList<>(list);
          Collections.sort(list1);
          correctTree(root, list, list1, new int[] { 0 });
     }

     void correctTree(Node root, ArrayList<Integer> list, ArrayList<Integer> list1, int[] index) {
          if (root == null)
               return;

          correctTree(root.left, list, list1, index);

          if (root.data != list1.get(index[0])) {
               root.data = list1.get(index[0]);
          }
          index[0]++;
          correctTree(root.right, list, list1, index);
     }

     void inOrder(ArrayList<Integer> list, Node root) {
          if (root == null)
               return;
          inOrder(list, root.left);
          list.add(root.data);
          inOrder(list, root.right);
     }

     public static void main(String[] args) {

     }
}