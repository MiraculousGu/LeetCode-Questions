public class Solution {
    public int[] moveZeroes(int[] nums) {
        int j = -1; //non-zero cursor
        for(int i = 0; i< nums.length; i++){
            if (nums[i] != 0){
                swap(nums,++j,i);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
