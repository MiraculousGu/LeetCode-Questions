public class Test {
    public static void main(String[] args) {
        String[] tc = {"abab","aba","ababab","abcabc","abac"};

        System.out.println("Solution 1:");
        Solution sl = new Solution();
        for (int i = 0; i< tc.length;i++){
            System.out.println("Test Cases " + i + ": " + sl.repeatedSubstringPattern(tc[i]));
        }

        System.out.println("Solution 2:");
        KMPSolution kmp = new KMPSolution();
        for (int i = 0; i<tc.length; i++){
            System.out.println("Test Cases " + i + ": " + kmp.repeatedSubstringPattern(tc[i]));
        }
    }

}
