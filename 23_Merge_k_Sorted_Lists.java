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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> unsorted = new ArrayList<Integer>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                unsorted.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        if (unsorted.size() == 0) return null; 
        Collections.sort(unsorted);
        ListNode head = new ListNode(unsorted.get(0));
        ListNode node = head;
        for (int i = 1; i < unsorted.size(); i++) {
            node.next = new ListNode(unsorted.get(i));
            node = node.next;
        }
        return head;
    }
}