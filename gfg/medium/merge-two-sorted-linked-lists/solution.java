/*  Structure of Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node ans = new Node(0);
        Node t = ans;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                t.next=head1;
                head1=head1.next;
            }else{
                t.next=head2;
                head2=head2.next;
            }
            t=t.next;
        }
        t.next = (head1 != null) ? head1 : head2;
        return ans.next;
    }
}