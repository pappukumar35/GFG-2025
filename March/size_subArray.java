package March;
public class size_subArray {


     public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
          // code here
          ArrayList<Integer> al=new ArrayList<>();
          Deque<Integer> dq=new ArrayDeque<>();
          for(int i=0;i<arr.length;i++){
              if(!dq.isEmpty() && dq.peekFirst()==i-k) dq.pollFirst();
              while(!dq.isEmpty() && arr[dq.peekLast()]<=arr[i]) dq.pollLast();
              dq.addLast(i);
              if(i>=k-1) al.add(arr[dq.peekFirst()]);
          }
          return al;
      }
     public static void main(String args[]){


     }
}

