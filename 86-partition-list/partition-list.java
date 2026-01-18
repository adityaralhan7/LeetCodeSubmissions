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
    public ListNode partition(ListNode head, int x) {
        ListNode temp=head;
        ListNode small=null;
        ListNode big=null;
        ListNode newSmall=null;
        ListNode newbig=null;
        while(temp!=null){
            if(temp.val<x){
                if(small==null){
                    small=temp;
                    newSmall=small;
                }
                else{
                    newSmall.next=temp;
                    newSmall=temp;

                }
            }
            else{
                if(big==null){
                    big=temp;
                    newbig=temp;
                }
                else{
                    newbig.next=temp;
                    newbig=temp;
                }
            }
            temp=temp.next;
        }
        if(newbig!=null) newbig.next=null;
        if(small==null) return big;
        newSmall.next=big;
        return small;
    }
}