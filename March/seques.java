package March;

import java.util.ArrayList;
import java.util.Arrays;

public class seques {
     public ArrayList<Integer> jobSequencing(int[] d, int[] p) {
          int n = d.length;
          Job[] arr = new Job[n];
          for (int i = 0; i < n; i++) {
               arr[i] = new Job(d[i], p[i]);
          }

          Arrays.sort(arr, (a, b) -> b.profit - a.profit);

          int maxJobDeadline = 0;
          for (Job a : arr) {
               maxJobDeadline = Math.max(maxJobDeadline, a.deadline);
          }

          int[] fillTime = new int[maxJobDeadline];
          Arrays.fill(fillTime, -1);

          int profit = 0, jobsDone = 0;
          for (Job a : arr) {
               for (int i = a.deadline - 1; i >= 0; i--) {
                    if (fillTime[i] == -1) {
                         fillTime[i] = i;
                         profit += a.profit;
                         jobsDone++;
                         break;
                    }
               }
          }

          return new ArrayList<>(Arrays.asList(jobsDone, profit));
     }

     class Job {
          int deadline, profit;

          Job(int deadline, int profit) {
               this.deadline = deadline;
               this.profit = profit;
          }
     }

     public static void main(String[] args) {

     }
}