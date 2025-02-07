package Febreary;
import java.util.*;
public class inorder{
     class Node {
          int data;
          Node left, right;
         Node(int item)    {
              data = item;
              left = right = null;
          }
      }
     void inorder(Node root , ArrayList<Integer> ans){
          if(root==null){
              return;
          }
          inorder(root.left,ans);
          ans.add(root.data);
          inorder(root.right,ans);
          
      }
      ArrayList<Integer> inOrder(Node root) {
          ArrayList<Integer> ans = new ArrayList<>();
          inorder(root,ans);
          return ans;
          // Code
      }
     public static void main(String args[]){

     }
}