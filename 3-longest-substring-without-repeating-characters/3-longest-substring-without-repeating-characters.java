import java.util.*;
import java.io.*;
import java.lang.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int tempIndex = 0, len = 0;
        String tempStr = "", finalStr = "";
        
        for( int i = tempIndex; i < s.length(); i++)
        {   
            //System.out.println("i : "+i);

            char tempChar = s.charAt(i);
            //System.out.println("tempChar : "+tempChar);
            if(!tempStr.contains(Character.toString(tempChar)))
            {
                tempStr =  tempStr.concat(Character.toString(tempChar));
                //System.out.println("tempStr : "+tempStr);
                if(len < tempStr.length())
                {
                    len = tempStr.length();
                }
            }
            else
            {
                if(len <= tempStr.length())
                {
                    finalStr = tempStr;
                    len = tempStr.length();
                }
                    tempStr = "";
                    i = tempIndex;
                    tempIndex ++;
                    //System.out.println("tempIndex : "+tempIndex);
            }
        }
        return len;
    }
}