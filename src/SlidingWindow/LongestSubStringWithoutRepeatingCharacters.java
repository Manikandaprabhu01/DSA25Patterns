package SlidingWindow;
import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
            String  s = "abcabcbb";
             System.out.print(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashSet<Character> setValue = new HashSet<>();
        int left=0;
        for(int right = 0; right < n; right ++){
            while(setValue.contains(s.charAt(right))){
                setValue.remove(s.charAt(left));
                left++;
            }
            setValue.add(s.charAt(right));
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
