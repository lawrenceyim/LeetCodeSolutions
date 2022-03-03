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
    public ListNode removeElements(ListNode head, int val) {
        ListNode returnNode = new ListNode(0);
        returnNode.next = head;
        ListNode previous = returnNode;
        while (head != null) {
            if (head.val == val) {
                previous.next = head.next;
                head.next = null;
                head = previous.next;
            } else {
                previous = head;
                head = head.next;
            }
        }
        return returnNode.next;
    }
}