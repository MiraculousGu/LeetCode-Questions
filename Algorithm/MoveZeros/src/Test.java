import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[][] tc = {{0,1,0,3,12},{0}};
        for (int i = 0; i<tc.length; i++)
            System.out.println(Arrays.toString(new Solution().moveZeroes(tc[i])));
    }
}
