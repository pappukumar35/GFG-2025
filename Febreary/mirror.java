package Febreary;
import java.util.*;
public class mirror{
     static class Node{
          int data;
          Node left;
          Node right;
          public Node(int data){
               this.left=left;
               this.right=right;
               this.data=null;
          }
     }
     public static void mirror(Node node){
          if(node==null){
               return;
          }
          node temp=node.left;
          node.left=node.right;
          node.right=temp;
          mirror(node.right);
          mirror(node.left);
     }
     public static void main(String args[]){

     }
}