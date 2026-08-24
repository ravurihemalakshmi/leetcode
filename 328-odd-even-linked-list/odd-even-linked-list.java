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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        if(head==null){
            return head;
        }
        int count=1;
        List<ListNode>odd=new ArrayList<>();
        List<ListNode>even=new ArrayList<>();
        while(temp!=null){
            if(count%2==0){
                even.add(temp);
            }
            else{
                odd.add(temp);
            }
            temp=temp.next;
            count++;

        }
        List<ListNode>oddev=new ArrayList<>();
        oddev.addAll(odd);
        oddev.addAll(even);
        for(int i=0;i<oddev.size()-1;i++){
            oddev.get(i).next=oddev.get(i+1);
        }
        oddev.get(oddev.size()-1).next=null;
        return oddev.get(0);
    }
}