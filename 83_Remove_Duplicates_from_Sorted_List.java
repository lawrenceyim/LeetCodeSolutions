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
        HashSet<Integer> seen = new HashSet<Integer>();
        ListNode returnNode = head;
        ListNode previous = head;
        while (head != null) {
            if (seen.contains(head.val)) {
                previous.next = head.next;
                head.next = null;
                head = previous.next;
            } else {
                seen.add(head.val);
                previous = head;
                head = head.next;
            }
        }
        return returnNode;
    }
}