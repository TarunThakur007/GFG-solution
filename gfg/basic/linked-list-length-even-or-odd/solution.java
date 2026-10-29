/* structure of link list node
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {
    public boolean isEven(Node head) {
        // code here
        Node temp = head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        if(length%2==0) {
            return true;
        }else{
            return false;
        }
        
        
    }
}