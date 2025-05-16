package may;
public class kth{
      public ArrayList<Integer> findSmallestRange(int[][] arr) {
        // code here
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int max = Integer.MIN_VALUE, start = 0, end = Integer.MAX_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(new int[]{arr[i][0], i, 0});
            max = Math.max(max, arr[i][0]);
        }

            while (minHeap.size() == arr.length) {
            int[] node = minHeap.poll();
            int minValue = node[0];

            if (max - minValue < end - start) {
                start = minValue;
                end = max;
            }

           
            if (node[2] + 1 < arr[node[1]].length) {
                int nextValue = arr[node[1]][node[2] + 1];
                minHeap.add(new int[]{nextValue, node[1], node[2] + 1});
                max = Math.max(max, nextValue);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(start);
        result.add(end);
        return result;
    }
     public static void main(String[] args) {
          
     }
}