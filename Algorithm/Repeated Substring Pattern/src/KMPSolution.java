import java.util.Arrays;

public class KMPSolution {
    public boolean repeatedSubstringPattern(String s) {
        int[] next = findNext(s);
        int length = s.length();
        if (next[length - 1] == 0)
            return false;
        return length % (length - next[length - 1]) == 0;
    }

    private int[] findNext(String pattern) {
        int length = pattern.length();
        //initialization
        int[] next = new int[length];
        int j = 0; //end position of prefix

        //loop
        //i: end position of the postfix
        for (int i = 1; i < length; i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = next[j - 1];
            }

            if (pattern.charAt(i) == pattern.charAt(j))
                j++;

            next[i] = j;
        }
        return next;
    }


}
