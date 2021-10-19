import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;

        //initialize pointers
        int start = 0;
        int end = 0;

        //initialize characters storage
        HashMap<Integer,Character> map = new HashMap();

        //O(n) runtime loop
        while (end < s.length()){
            char c = s.charAt(end);
            //check if the map contains the character
            if(map.containsValue(c)){
                map.remove(start);
                start ++;
            } else{
                map.put(end,c);
                end++;
            }
            length = Math.max(end-start,length);
        }
        System.out.println(length);
        return length;
    }
}
