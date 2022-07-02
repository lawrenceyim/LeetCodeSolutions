# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if list1 == None and list2 == None:
            return None
        elif list1 == None:
            return list2
        elif list2 == None:
            return list1
        
        return_node = None
        if list1.val <= list2.val:
            return_node = list1
            list1 = list1.next
        else:
            return_node = list2
            list2 = list2.next
            
        current_node = return_node
        while list1 != None and list2 != None:
            if list1.val <= list2.val:
                current_node.next = list1
                current_node = current_node.next
                list1 = list1.next
            else:
                current_node.next = list2
                current_node = current_node.next
                list2 = list2.next
        while list1 != None:
            current_node.next = list1
            current_node = current_node.next
            list1 = list1.next
        while list2 != None:
            current_node.next = list2
            current_node = current_node.next
            list2 = list2.next
        
        return return_node