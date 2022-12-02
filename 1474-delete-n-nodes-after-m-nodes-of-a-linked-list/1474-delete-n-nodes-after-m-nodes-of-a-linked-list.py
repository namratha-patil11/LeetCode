# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteNodes(self, head: ListNode, m: int, n: int) -> ListNode:
        
        node = head
        res = head
        m_cnt = 1
        
        
        while node != None:
            
            if m_cnt == m:
                m_cnt = 0
                print(node.val)
                n_cnt = 0
                ref = node
                while node.next != None and n_cnt != n:
                    print("in n -> " + str(node.val))
                    node = node.next
                    n_cnt += 1
                    
                ref.next = node.next
                
            m_cnt += 1
            node = node.next
        
        return res
            
        
     
        
        