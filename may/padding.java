package may;

public class padding {
     ArrayList<Integer> nthRowOfPascalTriangle(int n) {
          ArrayList<Integer> list = new ArrayList<>();
          list.add(1);
          int ans = 1;
          for (int i = 1; i < n; i++) {
               ans = ans * (n - i);
               ans = ans / i;
               list.add(ans);
          }
          return list;
     }

     public static void main(String[] args) {

     }
}