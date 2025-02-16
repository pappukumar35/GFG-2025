package Febreary;

import java.util.ArrayList;

public class serilize {
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

     public ArrayList<Integer> serialize(Node root) {
          // code here
          ArrayList<Integer> ans = new ArrayList<Integer>();
          serializeHelper(root, ans);
          return ans;
     }

     // Function to deserialize a list and construct the tree.
     public Node deSerialize(ArrayList<Integer> arr) {
          // code here
          int[] res = new int[1];
          return deSerializeHelper(arr, res);
     }

     public void serializeHelper(Node root, ArrayList<Integer> ans) {
          if (root == null) {
               ans.add(null);
               return;
          }

          ans.add(root.data);
          serializeHelper(root.left, ans);
          serializeHelper(root.right, ans);

     }

     public Node deSerializeHelper(ArrayList<Integer> arr, int[] index) {
          if (index[0] >= arr.size() || arr.get(index[0]) == null) {
               index[0]++;
               return null;
          }
          Node root = new Node(arr.get(index[0]));
          index[0]++;
          root.left = deSerializeHelper(arr, index);
          root.right = deSerializeHelper(arr, index);
          return root;

     }

     public static void main(String[] args) {

     }
}