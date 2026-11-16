/* Linked List Node Structure
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    int getMiddle(Node head) {
        // code here
        int count = 0;
        int mid=0;
        Node temp = head;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        if(count%2==0){
            mid = count/2;
        }
        else{
            mid = (count/2)+1;
        }
        count = 0;
        temp = head;
        while(count<mid){
            count++;
            temp=temp.next;
        }
        return temp.data;
    }
}