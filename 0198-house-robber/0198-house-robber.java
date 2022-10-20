class Solution {
    public int rob(int[] nums) {
        
        int[]temp = new int[nums.length];
        int length = nums.length;
        
        if(length == 1){
            temp[0] = nums[0];
            return temp[0];
        }else if(length == 2){
            temp[1] = Math.max(nums[0],nums[1]);
            return temp[1];
        }
        
        temp[0] = nums[0];
        temp[1] = nums[1];
        temp[2] = Math.max(nums[0] + nums[2],nums[1]);
        
        for(int i = 3; i < length ; i++){
            temp[i] = nums[i] + Math.max(temp[i-2],temp[i-3]);
        }
        
        Arrays.sort(temp);
        return temp[length-1];
    }
}