class Solution(object):
    def reverse(x):
        """
        :type x: int
        :rtype: int
        """
        INT_MAX = (2**31)

        flag = False
        if x < 0:
            flag = True
            x*= -1
        
        result = 0
        while(x>0):
            if(result > INT_MAX / 10):
                return 0
            result = result * 10 + x % 10
            x = x // 10           

        if(flag):
            result *= -1
        return result

print(Solution.reverse(1563847412))