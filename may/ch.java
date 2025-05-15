package may;
public class ch{
     public int countSubstring(String s) {
        // code here
        Map<Character, Integer> freqMap = new HashMap<>();
        int count = 0;

        // Traverse the string
        for (char ch : s.toCharArray()) {
            // If the character is already in the map, add its count to the result
            count += freqMap.getOrDefault(ch, 0);

            // Increment the frequency of the character
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Each single character is a valid substring
        count += s.length();

        return count;
    }
     public static void main(String[] args) {
          
     }
}