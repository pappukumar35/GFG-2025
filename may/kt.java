package may;

public class kth {
     public int kthSmallest(int[][] matrix, int k) {
          PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
          for (int i = 0; i < matrix.length; i++) {
               for (int j = 0; j < matrix[0].length; j++) {
                    pq.add(matrix[i][j]);
                    if (pq.size() > k) {
                         pq.poll(); // Remove the largest element to maintain k smallest
                    }
               }
          }
          return pq.poll(); // The k-th smallest element
     }

     public static void main(String[] args) {

     }
}