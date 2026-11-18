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
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp=head;
        ListNode pre = head;
        while(temp!=null && temp.next!=null){
            st.push(pre.val);
            pre = pre.next;
            temp = temp.next.next;
        }
        if(temp!=null) pre = pre.next;
        while(pre!=null){
            if(st.pop()!=pre.val){
                return false;
            }
            pre = pre.next;
        }
        return true;
    }
}