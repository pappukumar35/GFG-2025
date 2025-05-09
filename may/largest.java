package may;

public class largest {

     public static String findMaximumNum(String str, int k) {

          String[] max = { "" };
          // max[0]="";
          findAllPossibleComb(str, k, 0, max);
          return max[0];
     }

     private static void findAllPossibleComb(String str, int k, int index, String[] max) {
          if (k == 0 || index == str.length() - 1) {
               // arrz.add(str);
               if (str.compareTo(max[0]) > 0)
                    max[0] = str;
               return;
          }

          for (int i = index + 1; i < str.length(); i++) {
               if (str.charAt(index) < str.charAt(i)) {
                    str = swap(index, i, str);
                    findAllPossibleComb(str, k - 1, index + 1, max);
                    str = swap(i, index, str);
               }
          }
          findAllPossibleComb(str, k, index + 1, max);

     }

     private static String swap(int a, int b, String s) {
          char[] myArray = s.toCharArray();
          char c = myArray[a];
          myArray[a] = myArray[b];
          myArray[b] = c;
          return new String(myArray);
     }

     public static void main(String[] args) {

     }
}
