import java.lang.*;
import java.io.*;
import java.util.*;

class Solution {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int midIndex = 0;
        int sizeArr = nums1.length + nums2.length;
        int[] finalArray = new int[sizeArr];
        int i,j,k;
        double res_med = 0;
        
        for(  i = 0,  j = 0, k = 0; i < nums1.length && j < nums2.length ; k++){
            if(nums1[i] < nums2[j] ){
                finalArray[k] = nums1[i];
                i++;
            }else {
                finalArray[k] = nums2[j];
                j++;
            }
        }
        while(  i < nums1.length){
            finalArray[k] = nums1[i];
            i++; k++;
        }
        while(  j < nums2.length){
            finalArray[k] = nums2[j];
            j++; k++;
        }
        
        int setSize = (nums1.length + nums2.length) ;
        
        if(setSize % 2 == 0 )
        {
            midIndex = setSize / 2;
            double sum = finalArray[midIndex - 1] + finalArray[midIndex];
            res_med = sum / 2;

        }
        else 
        {
            int midIndex_double = setSize  / 2;
            res_med = finalArray[midIndex_double];
        }
        
        return res_med;
    }
    
}