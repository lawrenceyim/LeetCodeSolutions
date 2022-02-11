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
import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack stack = new Stack();
        Queue<Integer> queue = new LinkedList<>();
        while (head != null) {
            stack.push(head.val);
            queue.add(head.val);
            head = head.next;
        }
        while (!stack.empty()) {
            if (stack.pop() != queue.poll()) return false;
        }
        return true;
    }
}