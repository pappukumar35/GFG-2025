package Febreary;

import java.util.Stack;
import java.util.*;

public class characetr {
     static boolean isBalanced(String s) {
          Stack<Character> stack = new Stack<>();

          for (char ch : s.toCharArray()) {
               if (ch == '(' || ch == '{' || ch == '[') {
                    stack.push(ch); // Push opening brackets
               } else {
                    if (stack.isEmpty())
                         return false; // No matching opening bracket

                    char top = stack.peek();
                    if ((ch == ')' && top == '(') ||
                              (ch == ']' && top == '[') ||
                              (ch == '}' && top == '{')) {
                         stack.pop(); // Matching bracket found
                    } else {
                         return false; // Mismatched bracket
                    }
               }
          }

          return stack.isEmpty(); // If empty, brackets are balanced
     }

     public static void main(String[] args) {

     }
}