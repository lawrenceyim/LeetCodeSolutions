# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current_node = head
        node_count = 0
        while current_node != None:
            node_count += 1
            current_node = current_node.next
        nodes_to_skip = node_count // 2
        current_node = head
        while nodes_to_skip > 0:
            current_node = current_node.next
            nodes_to_skip -= 1
        return current_node