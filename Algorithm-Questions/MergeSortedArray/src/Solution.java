public class Solution {

    public static void main(String args[]){
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};

        merge(nums1, 3, nums2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //initialize three pointers
        int p1 = m-1;
        int p2 = n-1;
        int current = m+n-1;


        while (!(p1 < 0 || p2 < 0)) {
            //compare largest number
            nums1[current--] = nums1[p1] > nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);

        for(int i = 0; i<m+n;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}
