package Febreary;
import java.util.*;
public class Height_Binary_Tree{
     static class Node {
          int data;
          Node left,right;
          Node (int item){
               this.data=item;
               this.left=left;
               this.right=right;
          }
     }
     public static int height(Node node){
          if(node==null) return -1;
          return Math.max(height(node.left),height(node.right)+1);
     }
     public static void main(String args[]){

     }
}