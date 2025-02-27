package Febreary;

import java.util.*;

public class stack {
     Stack<Integer> st;
     int min;

     // Add an element to the top of Stack
     public void push(int x) {
          if (st.size() == 0) {
               st.push(x);
               min = x;
          } else {
               if (x < min) {
                    int temp = 2 * x - min;
                    st.push(temp);
                    min = x;
               } else {
                    st.push(x);
               }
          }
     }

     // Remove the top element from the Stack
     public void pop() {
          if (st.size() == 0)
               return;
          else {
               int temp = st.pop();
               if (temp >= min)
                    return;
               else {
                    int ans = min;
                    min = 2 * min - temp;
               }
          }
     }

     // Returns top element of the Stack
     public int peek() {
          if (st.size() == 0)
               return -1;
          else {
               int temp = st.peek();
               if (temp >= min)
                    return temp;
               else {
                    return min;
               }
          }
     }

     // Finds minimum element of Stack
     public int getMin() {
          if (st.size() == 0)
               return -1;
          return min;
     }

     public static void main(String[] args) {

     }
}