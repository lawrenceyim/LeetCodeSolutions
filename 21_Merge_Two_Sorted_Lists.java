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
import java.util.PriorityQueue;
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        PriorityQueue<Integer> sorted = new PriorityQueue<Integer>();
        while (l1 != null) {
            sorted.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sorted.add(l2.val);
            l2 = l2.next;
        }
        if (sorted.size() == 0) return null;
        ListNode head = new ListNode(sorted.poll());
        ListNode current = head;
        while (sorted.size() > 0) {
            current.next = new ListNode(sorted.poll());
            current = current.next;
        }
        return head;
    }
}