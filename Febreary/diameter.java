package Febreary;
import java.util.*;
public class diameter{
     class Node {
          int data;
          Node left;
          Node right;
          Node(int data) {
              this.data = data;
              left = null;
              right = null;
          }
      }
     int fans=0;
     public int depth(Node root){
          if(root==null) return 0;
          int l=depth(root.left);
          int r=depth(root.right);
          fans=Math.max(fans,(l+r));
          return (1+math.max(l,r));
     }
     public int diameter(Node root){
          depth(root);
          return fans;
     }
     public static void main(String args[]){
          int radius=5;
     }
}