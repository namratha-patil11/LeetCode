class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
           
        zero_Count = nums.count(0)
        for i in range(zero_Count):
            nums.remove(0) 
            nums.append(0) 
        
        print(nums)