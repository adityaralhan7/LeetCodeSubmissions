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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow;
        ListNode prev=null;
        ListNode next=null;
        while(mid!=null){
            next=mid.next;
            mid.next=prev;
            prev=mid;
            mid=next;
        }
        int ans=0;
        ListNode curr=head;
        while(curr!=null&&prev!=null){
            ans=Math.max(ans,curr.val+prev.val);
            curr=curr.next;
            prev=prev.next;
        }
        return ans;
    }
}