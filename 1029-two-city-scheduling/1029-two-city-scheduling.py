class Solution:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        
        length = len(costs)
        mid = length//2
        res = 0
        
        costs.sort(key = lambda x  : x[0] - x[1])
        
        for i in range(mid):
            res = res + costs[i][0] + costs[i+mid][1]

        return res
            