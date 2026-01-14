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
    public ListNode doubleIt(ListNode head) {
        ListNode prev=new ListNode();
        ListNode newHead=reverse(head);
        int carry=0;
        int sum=0;
        ListNode temp=newHead;
        while(temp!=null){
            int val=temp.val;
            sum=val*2;
            sum+=carry;
            if(sum>9) carry=1;
            else carry=0;
            temp.val=sum%10;
            sum=0;
            prev=temp;
            temp=temp.next;
        }
            ListNode node=new ListNode(carry);
            if(carry==1){
                 prev.next=node;
            }
            ListNode ans=reverse(newHead);
            return ans;
    }

    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}