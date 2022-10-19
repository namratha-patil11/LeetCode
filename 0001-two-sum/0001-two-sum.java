class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        
        for(int i = 0; i < nums.length; i++){
        int difference = target - nums[i];
            if(map.containsKey(difference) && map.get(difference) != i){
                result[0] = i;
                result[1] = map.get(difference);
            }
        }
        return result;
    }
}