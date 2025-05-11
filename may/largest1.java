public class largest1 {
     public static int kthLargest(int[] arr, int k) {
          int n = arr.length;
          PriorityQueue<Integer> pq = new PriorityQueue<>();

          for (int i = 0; i < n; i++) {
               int sum = 0;
               for (int j = i; j < n; j++) {
                    sum += arr[j];
                    pq.add(sum);
                    while (pq.size() > k) {
                         pq.poll();
                    }
               }
          }

          return pq.poll();
     }

     public static void main(String[] args) {

     }
}
