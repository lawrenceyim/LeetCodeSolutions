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
import java.util.ArrayList;

class Solution {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> numbers = new ArrayList<ListNode>();
        while (head != null) {
            numbers.add(head);
            head = head.next;
        }
        return numbers.get(numbers.size() / 2);
    }
}