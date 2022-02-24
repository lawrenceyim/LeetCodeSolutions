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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        while (head != null) {
            queue.add(head.val);
            head = head.next;
        }
        if (queue.size() == 0) return null;
        ListNode newHead = new ListNode(queue.poll());
        ListNode current = newHead;
        while (queue.size() > 0) {
            current.next = new ListNode(queue.poll());
            current = current.next;
        }
        return newHead;
    }
}