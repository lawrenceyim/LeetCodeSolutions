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
    public ListNode reverseList(ListNode head) {
        ListNode return_head = head;
        ListNode new_head = head;
        Stack<Integer> reversed = new Stack();
        while(head != null) {
            reversed.push(head.val);
            head = head.next;
        }
        while (!reversed.empty()) {
            new_head.val = reversed.pop();
            new_head = new_head.next;
        }
        return return_head;
    }
}