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
        ListNode result=new ListNode(0);
        ListNode ans=result;
        ListNode temp=head.next;
        int  sum=0;
        while(temp!=null)
        {
            if(temp.val!=0)
            {
                sum+=temp.val;
                temp=temp.next;
            }
            else
            {
                result.next=new ListNode(sum);
                sum=0;
                result=result.next;
                temp=temp.next;
            }
        }
        return ans.next;
    }
}