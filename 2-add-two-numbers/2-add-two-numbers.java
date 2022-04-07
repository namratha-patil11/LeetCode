/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
import java.util.LinkedList;
import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.lang.*;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       int carry = 0, num1 = 0, num2 = 0, t = 0;
       ListNode l = new ListNode(0);
       ListNode l3 = l;
        
        while(l1 != null || l2 != null){
            
            num1 = (l1 == null)? 0 : l1.val;
            num2 = (l2 == null)? 0 : l2.val;
            
            t = num1 + num2 + carry;
            carry = t / 10;
            
            l3.next = new ListNode(t % 10);
            l3 = l3.next;
          
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry>0){
            l3.next = new ListNode(carry);
        }

        return l.next;
    }
}