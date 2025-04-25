package April;
public class majority{
     static int majorityElement(int arr[]) {
          int n = arr.length;
          int l = n/2;
          Map<Integer,Integer> map = new HashMap<>();
          for(int i=0;i<n;i++)
          {
              if(map.getOrDefault(arr[i],0)<l)
              map.put(arr[i],map.getOrDefault(arr[i],0)+1);
              else
              return arr[i];
          }
          return -1;
      }
     public static void main(String[] args) {
          
     }
}