/**
 * // This is the ImmutableListNode's API interface.
 * // You should not implement it, or speculate about its implementation.
 * class ImmutableListNode {
 *     public void PrintValue(); // print the value of this node.
 *     public ImmutableListNode GetNext(); // return the next node.
 * }
 */

public class Solution {
    public void PrintLinkedListInReverse(ImmutableListNode head) {
        Stack<ImmutableListNode> reversed = new Stack<ImmutableListNode>();
        ImmutableListNode node = head;
        while (node != null) {
            reversed.Push(node);
            node = node.GetNext();
        }
        while (reversed.Any()) {
            reversed.Pop().PrintValue();
        }
    }
}