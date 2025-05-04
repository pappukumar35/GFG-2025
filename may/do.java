package may;
public class do{
     public int findSubString(String str) {
          // code here  
          Set<Character> hs=new HashSet<>();
          for(char ch:str.toCharArray()){
              hs.add(ch);
          }
           int ans = Integer.MAX_VALUE;
          int totalUniqueCharacters=hs.size();
          Map<Character,Integer> hm=new HashMap<>();
          int j=0;
          for(int i=0;i<str.length();i++){
              hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
              
              if(hm.size()==totalUniqueCharacters){
                  while(hm.get(str.charAt(j))>1){
                      int freq=hm.get(str.charAt(j));
                      hm.put(str.charAt(j),freq-1);
                      j++;
                  }
                  ans=Math.min(ans,i-j+1);
              }
              
          }
          return ans;
      }
     public static void main(String args[]){

     }
}