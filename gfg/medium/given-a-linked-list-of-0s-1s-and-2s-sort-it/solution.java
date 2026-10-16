/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

// class Solution {
//     public Node segregate(Node head) {
//         // code here
//         Node temp = head;
//         Node current = head;
//         Node pre = temp.next;
//         while(temp!=null && temp.next!=null){
//             temp = temp.next;
//             if(temp.data==0){
//                 int s = current.data;
//                 current.data = temp.data;
//                 temp.data = s;
//                 current = current.next;
//             }else if(temp.data==1){
//                 int x = pre.data;
//                 pre.data = temp.data;
//                 temp.data = x;
//                 pre = pre.next;
//                 temp = temp.next;
//             }else{
//                 temp = temp.next;
//             }
//         }
//         return head;
//     }
// }
class Solution {
    public Node segregate(Node head) {
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) cnt0++;
            else if (curr.data == 1) cnt1++;
            else cnt2++;
            curr = curr.next;
        }
        curr = head;
        int idx = 0;
        while (curr != null) {
            if (idx < cnt0) { curr.data = 0; }
            else if (idx < cnt0 + cnt1) { curr.data = 1; }
            else { curr.data = 2; }
            idx++;
            curr = curr.next;
        }
        return head;
    }
}   