class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        directions = [[0,1],[1,0],[0,-1],[-1,0]] 
        R = len(matrix)
        C = len(matrix[0])
        output = []
        r,c = 0,0
        
        def isvalid(i,j,direction):
            i += direction[0]
            j += direction[1]
            if  i < 0 or i >= R or j < 0 or j >= C or matrix[i][j] == 101:
                return False
            return True
            
        def dfs(i,j,direction):
            nonlocal r,c
            i += direction[0]
            j += direction[1]
            output.append(matrix[i][j])
            matrix[i][j] = 101
            r,c = i,j
            if isvalid(i,j,direction):
                dfs(r,c,direction)
            
            
        while len(output) < R * C:
            if matrix[r][c] != 101:
                output.append(matrix[r][c])
            matrix[r][c] = 101
            for direction in directions:
                while True:
                    if not isvalid(r,c,direction):
                        break
                    else:
                        dfs(r,c,direction)
                    
        return output
                
        
        
            
            
            
        
        
        