class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        #using greedy Approach
        # time complexity is O(n log n) - for sort 
        # space Complexity is 
        res = 0
        n = len(costs) // 2
        
        costs.sort(key = lambda x : x[0] - x[1])

        for i in range(n):
            res += costs[i][0] + costs[i + n][1]
        
        return res