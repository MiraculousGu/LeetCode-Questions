class Solution(object):
    def search(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        #default return value
        position = -1
        
        #two pointers
        left = 0
        right = len(nums) - 1
        pointer = (left + right) // 2 
        while(True):
            if(nums[pointer] == target):
                position = pointer
                break

            elif(nums[pointer] < target):
                left = pointer + 1
                
            elif(nums[pointer] > target):
                right = pointer - 1

            if left > right:
                break

            pointer = (left + right) // 2
            

        return position


a = [5]
print(Solution.search(nums = a,target = -5))
