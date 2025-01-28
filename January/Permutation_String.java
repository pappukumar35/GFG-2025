package January;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;

public class Permutation_String {
     public ArrayList<String> findPermutation(String s) {
          // Code here
          HashSet<String> set = new HashSet<>();
          ArrayList<String> list = new ArrayList<>();
          permute(s, set, 0, s.length());
          for (String ss : set) {
               list.add(ss);
          }
          return list;
     }

     public void permute(String s, HashSet<String> set, int l, int r) {
          if (l == r) {
               set.add(s);
               return;
          }
          for (int i = l; i < r; i++) {
               s = swap(s, l, i);
               permute(s, set, l + 1, r);
               s = swap(s, l, i);
          }
     }

     public String swap(String s, int l, int i) {
          StringBuilder str = new StringBuilder(s);
          char ch1 = s.charAt(l);
          char ch2 = s.charAt(i);
          str.setCharAt(l, ch2);
          str.setCharAt(i, ch1);
          return str.toString();
     }

     public static void main(String[] args) {

     }

}