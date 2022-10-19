class Solution {
    
   
    public void bfs(int[][] M, int[] visited, int i){
        for(int j = 0 ; j < M.length ; j++){
            
            if(M[i][j] == 1 && visited[j] == 0){
                visited[j] = 1;
                bfs(M,visited,j);
            }           
        }
    }
    
    public int findCircleNum(int[][] M) {
        int[] visited = new int[M.length];
        int count = 0;
        
        for (int i = 0 ; i < M.length ; i++){
                if(visited[i] == 0){
                    bfs(M,visited,i);
                    count +=1;
                }
            }
        return count;
    }
    
}