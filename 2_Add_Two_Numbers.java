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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num = new StringBuilder();
        BigInteger number1, number2;
        while (l1 != null) {
            num.insert(0, String.valueOf(l1.val));
            l1 = l1.next;
        }
        number1 = new BigInteger(num.toString());
        num = new StringBuilder();
        while (l2 != null) {
            num.insert(0, String.valueOf(l2.val));
            l2 = l2.next;
        }
        number2 = new BigInteger(num.toString());
        String number3 = String.valueOf(number1.add(number2));
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        for (int i = 0; i < number3.length(); i++) {
            stack.push(Character.getNumericValue(number3.charAt(i)));        
        }
        ListNode head = new ListNode(stack.poll());
        ListNode returnValue = head;
        while (!stack.isEmpty()) {
            head.next = new ListNode(stack.poll());
            head = head.next;
        }
        return returnValue;
    }
}