package April;
public class uni{
     public int getSingle(int[] arr) {
          HashMap<Integer,Integer> map = new HashMap<>();
           for(int i=0; i<arr.length; i++)
           {
               map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
           }
           for (Map.Entry<Integer,Integer> entry : map.entrySet()) 
           {
              if(entry.getValue()==1)
              return entry.getKey();
           }
           return -1;
          
      }
     public static void main(String[] args) {
          
     }
}