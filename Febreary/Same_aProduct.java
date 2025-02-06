package Febreary;
import java.util.*;
public class Same_aProduct{
     public static class Node{
          int data;
          Node left;
          Node right;
          NOde(int data){
               this.left=left;
               this.right=rihgt;
          }
     }
     public static int rootInInorder(int i, int j, int value, int [] inorder){
          for(int k = i; k<= j; k++){
              if(inorder[k] == value) return k;
          }
          return i;
      }
      
      public static Node constructBinaryTree(int [] inorder, int preorder[], int i1, int j1, int i2, int j2){
          if(i2 > j2) return null;
          Node root = new Node(preorder[i2]);
          int index = rootInInorder(i1, j1, preorder[i2], inorder);
          root.left = constructBinaryTree(inorder, preorder, i1, index - 1, i2 + 1, i2 + index - i1);
          root.right = constructBinaryTree(inorder, preorder, index + 1, j1, i2 + index - i1 + 1, j2);
          return root;
      }
      
      public static Node buildTree(int inorder[], int preorder[]) {
         int n = inorder.length;
         return constructBinaryTree(inorder, preorder, 0, n - 1, 0, n - 1);
      }
     public static void main(String args[]){

     }
}