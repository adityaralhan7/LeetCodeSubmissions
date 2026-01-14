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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode dummy=new ListNode(-1);
        dummy.next=list1;
        ListNode prev=list1;
        ListNode curr=list1;
        while(count<a){
            prev=curr;
            curr=curr.next;
            count++;
        }
        while(count<b){
            curr=curr.next;
            count++;
        }
        prev.next=list2;
        ListNode temp=list2;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=curr.next;
        return dummy.next;
    }
}