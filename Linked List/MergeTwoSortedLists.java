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
class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode();
        ListNode cur = l3;

        
        while(l1!=null && l2!=null ){
            
            if(l1.val<=l2.val){
                cur.next= l1;
                l1 = l1.next;
                
            }else{
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if(l1 == null){
            cur.next = l2;
        }else{
            cur.next = l1;
        }
        // l3.next = (l1 != null)? l2 : l1;
        return l3.next;
    }
}

//https://leetcode.com/problems/merge-two-sorted-lists/?envType=study-plan-v2&envId=top-interview-150