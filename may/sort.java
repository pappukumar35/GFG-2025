package may;

public class sort {
     public int compute(int x, int A, int B, int C) {
          return A * x * x + B * x + C;
     }

     public ArrayList<Integer> sortArray(int[] arr, int A, int B, int C) {
          // Code here
          int n = arr.length;
          ArrayList<Integer> sorted = new ArrayList<>();
          int[] sortedArr = new int[n];
          int i = 0, j = n - 1;
          int index = A > 0 ? n - 1 : 0;

          while (i <= j) {
               int f1 = compute(arr[i], A, B, C);
               int f2 = compute(arr[j], A, B, C);
               if (A > 0) {
                    if (f1 > f2) {
                         sortedArr[index--] = f1;
                         i++;
                    } else {
                         sortedArr[index--] = f2;
                         j--;
                    }
               } else {
                    if (f1 < f2) {
                         sortedArr[index++] = f1;
                         i++;
                    } else {
                         sortedArr[index++] = f2;
                         j--;
                    }
               }
          }
          for (int a : sortedArr) {
               sorted.add(a);
          }
          return sorted;
     }

     public static void main(String[] args) {

     }
}