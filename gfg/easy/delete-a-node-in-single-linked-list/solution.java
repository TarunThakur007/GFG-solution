/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        int count = 0;
        Node temp = new Node(0);
        temp.next = head;
        Node current = temp;
        while(current.next != null){
            count++;
            if(count==x){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return temp.next;
    }
}