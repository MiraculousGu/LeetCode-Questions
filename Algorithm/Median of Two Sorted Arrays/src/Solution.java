public class Solution {
    public static void main(String args[]){
        int[] a = {1,2};
        int[] b = {3,4};

        double result = findMedianSortedArrays(a,b);
        System.out.println(result);
    }
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;

        //determine larger and smaller array
        if(nums1.length > nums2.length){
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;   //make sure array 1 is smaller
        }
        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;

        int totalLeft = (total+1)/2;

        //define pointers for the shorter array
        int l = 0;   //left pointer index
        int r = m;    //right pointer index


        //binary search
        while(l<r){
            int i = l + (r-l+1) / 2;
            int j = totalLeft - i;
            if (nums1[i-1] > nums2[j]){
                r = i-1;
            } else {
                l = i;
            }
        }

        //initialize values aside from the break line
        int i = l;
        int j = totalLeft - i;
        int num1LeftMax = i == 0 ? Integer.MIN_VALUE : nums1[i-1];
        int num2LeftMax = j == 0 ? Integer.MIN_VALUE : nums2[j-1];
        int num1RightMin = i == m ? Integer.MAX_VALUE : nums1[i];
        int num2RightMin = j == n ? Integer.MAX_VALUE : nums2[j];

        if (total % 2 == 1){
            //if the length is odd, choose the left max
            res = Math.max(num1LeftMax,num2LeftMax);
        } else {
            res = (double) (Math.max(num1LeftMax,num2LeftMax) + Math.min(num1RightMin,num2RightMin)) / 2;
        }
        return res;
    }
}

// [1 2 3 4 5 6 7 8 9 10]
// [4 5 6 7 8 9 10 11 12 13]