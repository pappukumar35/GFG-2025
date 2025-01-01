package January;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Anagrams_Together {
     public ArrayList<ArrayList<String>> anagrams(String[] arr) {
          TreeMap<String, ArrayList<String>> map = new TreeMap<>();
          int n = arr.length;
          for (int i = 0; i < n; i++) {
               int[] freq = new int[26];
               for (char c : arr[i].toCharArray())
                    freq[c - 'a']++;
               StringBuilder hash = new StringBuilder();
               for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                         hash.append((char) (k + 'a'));
                         hash.append(freq[k]);
                    }
               }
               String hashStr = hash.toString();
               if (!map.containsKey(hashStr)) {
                    ArrayList<String> list = new ArrayList<>();
                    list.add(arr[i]);
                    map.put(hashStr, list);
               } else {
                    ArrayList<String> list = map.get(hashStr);
                    list.add(arr[i]);
               }
          }
          ArrayList<ArrayList<String>> ans = new ArrayList<>();
          for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
               ArrayList<String> list = new ArrayList<>();
               for (String data : entry.getValue())
                    list.add(data);
               ans.add(list);
          }
          return ans;
     }

     public static void main(String[] args) {

     }
}