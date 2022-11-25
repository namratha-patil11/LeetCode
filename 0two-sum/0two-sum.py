class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        myMap = dict()
        
        for i in range(len(nums)):
            myMap[nums[i]] = i
            
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in myMap and myMap[complement] != i:
                return [myMap[complement],i]
            
        
        
        
        