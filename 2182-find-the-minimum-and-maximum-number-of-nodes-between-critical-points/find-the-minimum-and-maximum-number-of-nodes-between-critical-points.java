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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head.next;
        ListNode prev=head;
        int index=1;
        while(temp.next!=null){
            if(temp.val<prev.val&&temp.val<temp.next.val) list.add(index);
            else if(temp.val>prev.val&&temp.val>temp.next.val) list.add(index);
            index++;
            prev=prev.next;
            temp=temp.next;
    }
            if(list.size()<2) return new int[]{-1,-1};
            int max=list.get(list.size()-1)-list.get(0);
            int min=Integer.MAX_VALUE;
            for(int i=1;i<list.size();i++){
                min=Math.min(min,list.get(i)-list.get(i-1));
            }

            return new int[]{min,max};
}
}