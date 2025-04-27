package April;

public class cot {
     public String multiplyStrings(String s1, String s2) {
          int signS1 = 1, signS2 = 1;
          while (s1.length() > 1 && s1.charAt(0) == '0' || s1.charAt(0) == '-') {
               if (s1.charAt(0) == '-')
                    signS1 = -1;
               s1 = s1.substring(1);
          }
          if (s1.charAt(0) == '0')
               return "0";
          while (s2.length() > 1 && s2.charAt(0) == '0' || s2.charAt(0) == '-') {
               if (s2.charAt(0) == '-')
                    signS2 = -1;
               s2 = s2.substring(1);
          }
          if (s2.charAt(0) == '0')
               return "0";
          StringBuilder ans = new StringBuilder();
          for (int i = s1.length() - 1; i >= 0; i--) {
               int carry = 0;
               int ind = s1.length() - i - 1;
               for (int j = s2.length() - 1; j >= 0; j--, ind++) {
                    int x = s1.charAt(i) - '0';
                    int y = s2.charAt(j) - '0';
                    int product = (x * y) + carry;
                    int digit = product % 10;
                    carry = product / 10;
                    if (ind >= ans.length()) {
                         ans.append(digit);
                    } else {
                         int z = ans.charAt(ind) - '0';
                         int sum = z + product;
                         int finalDigit = sum % 10;
                         carry = sum / 10;
                         ans.setCharAt(ind, (char) (finalDigit + '0'));
                    }
               }
               while (carry > 0) {
                    ans.append((char) (carry % 10 + '0'));
                    carry /= 10;
               }
          }

          if (signS1 * signS2 == -1)
               ans.append('-');
          return ans.reverse().toString();
     }

     public static void main(String[] args) {

     }
}