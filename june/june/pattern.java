package june;

import java.util.*;

public class pattern {
     private final int PRIME = 101;

     public double calculateHash(String str) {
          double hash = 0;
          for (int i = 0; i < str.length(); i++) {
               hash += str.charAt(i) * Math.pow(PRIME, i);
          }
          return hash;
     }

     public double updateHash(double prevHash, char oldChar, char newChar, int len) {
          double newHash = (prevHash - oldChar) / PRIME;
          newHash += newChar * Math.pow(PRIME, len - 1);
          return newHash;
     }

     ArrayList<Integer> search(String pat, String txt) {
          ArrayList<Integer> ans = new ArrayList<>();
          int len = pat.length();

          if (txt.length() < len)
               return ans;

          double patHash = calculateHash(pat);
          double txtHash = calculateHash(txt.substring(0, len));

          for (int i = 0; i <= txt.length() - len; i++) {
               if (patHash == txtHash) {
                    if (pat.equals(txt.substring(i, i + len))) {
                         ans.add(i + 1);
                    }
               }

               if (i < txt.length() - len) {
                    txtHash = updateHash(txtHash, txt.charAt(i), txt.charAt(i + len), len);
               }
          }

          return ans;
     }

     public static void main(String[] args) {

     }
}