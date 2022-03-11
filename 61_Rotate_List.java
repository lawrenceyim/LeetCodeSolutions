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
    public ListNode rotateRight(ListNode head, int k) {
        Queue<Integer> numbers = new LinkedList<Integer>();
        while (head != null) {
            numbers.add(head.val);
            head = head.next;
        }
        if (numbers.size() == 0) return null;
        int rotate = k % numbers.size();
        int[] rotated = new int[numbers.size()];
        for (int i = rotate; i < rotated.length; i++) {
            rotated[i] = numbers.poll();
        }
        for (int i = 0; i < rotate; i++) {
            rotated[i] = numbers.poll();
        }
        ListNode returnNode = new ListNode(rotated[0]);
        ListNode current = returnNode;
        for (int i = 1; i < rotated.length; i++) {
            current.next = new ListNode(rotated[i]);
            current = current.next;
        }
        return returnNode;
    }
}