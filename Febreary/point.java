package Febreary;

import java.util.*;
import java.util.PriorityQueue;

public class point {

     class Pair implements Comparable<Pair> {
          int x;
          int y;
          int dist;

          Pair(int x, int y, int dist) {
               this.x = x;
               this.y = y;
               this.dist = dist;
          }

          @Override
          public int compareTo(Pair p2) {
               return this.dist - p2.dist;
          }
     }

     public int[][] kClosest(int[][] points, int k) {
          // Your code here
          int[][] ans = new int[k][2];
          PriorityQueue<Pair> pq = new PriorityQueue<>();

          for (int i = 0; i < points.length; i++) {
               int x = points[i][0];
               int y = points[i][1];
               int dist = (x * x) + (y * y);

               pq.offer(new Pair(x, y, dist));
          }

          while (k > 0) {
               k--;
               Pair curr = pq.poll();
               ans[k][0] = curr.x;
               ans[k][1] = curr.y;
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}