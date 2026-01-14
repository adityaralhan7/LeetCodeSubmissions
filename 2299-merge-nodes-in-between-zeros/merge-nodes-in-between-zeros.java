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
    public ListNode mergeNodes(ListNode head) {
       int sum=0;
       ListNode temp=head.next;
       ListNode newHead=null;
       ListNode prev=null;
       while(temp!=null){
            if(temp.val==0){
                ListNode newNode=new ListNode(sum);
                if(newHead==null){
                    newHead=newNode;
                    prev=newHead;
                    sum=0;
                }
                else{
                prev.next=newNode;
                prev=newNode;
                sum=0;
            }
            }
            else{
                sum+=temp.val;
            }
            temp=temp.next;
       }
       return newHead;
}
}