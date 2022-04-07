class Solution {
    
    public String longestPalindrome(String s) {
        
        int start=0,end=0,max_len=1;
        
        // for odd
        for(int i=0;i < s.length()-1;i++){
           int l = i,r = i;
           
           while(l >=0 && r<s.length()){
               if(s.charAt(l)==s.charAt(r)){
                   l--;
                   r++;
               }else
                   break;
           }
            int len = r-l-1;
            if(len>max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }
        
        // for even
        for(int i=0;i < s.length()-1;i++){
           int l = i,r = i+1;
           
           while(l >=0 && r<s.length()){
               if(s.charAt(l)==s.charAt(r)){
                   l--;
                   r++;
               }else
                   break;
           }
            int len = r-l-1;
            if(len>max_len){
                max_len = len;
                start = l+1;
                end = r-1;
            }
        }
        return s.substring(start,end+1);
    }
}