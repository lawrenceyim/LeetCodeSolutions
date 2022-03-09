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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        PriorityQueue<Integer> unique = new PriorityQueue<Integer>();
        Set<Integer> banned = new HashSet<Integer>();
        while (head != null) {
            if (!unique.contains(head.val) && !banned.contains(head.val)) {
                unique.add(head.val);
            } else if (unique.contains(head.val)) {
                unique.remove(head.val);
                banned.add(head.val);
            }
            head = head.next;
        }
        if (unique.isEmpty()) return null;
        ListNode returnNode = new ListNode(unique.poll());
        ListNode current = returnNode;
        while (!unique.isEmpty()) {
            current.next = new ListNode(unique.poll());
            current = current.next;
        }
        return returnNode;
    }
}