class Solution {
    public int reverse(int x) {
        
        boolean isNegative = false;
        long res = 0;
        
        if(x < 0)   isNegative = true;
        long num = Math.abs(x);
        
        while(num != 0){
            res = res * 10 + num % 10;
            num = num / 10;
        }
        
        if(isNegative) res = res * (-1);
            
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE){
            return 0;
        }
        else {
            return (int)res;
        } 
        
    }
}