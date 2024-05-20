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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)
            return null;
        if(list1==null && list2!=null)
            return list2;
        ListNode temp=list1;
        ListNode t=null;
        while(temp!=null)
        {
            t=temp;
            temp=temp.next;
        }
        t.next=list2;
        List<Integer> li = new ArrayList<>();
        temp=list1;
        while(temp!=null)
        {
            li.add(temp.val);
            temp=temp.next;
        }
        Collections.sort(li);
        temp=list1;
        int ind=0;
        while(temp!=null)
        {
            temp.val=li.get(ind);
            ind++;
            temp=temp.next;
        }
        return list1;        
    }
}