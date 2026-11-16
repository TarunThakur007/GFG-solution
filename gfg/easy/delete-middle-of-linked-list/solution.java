/* Node Structure
class Node {
	int data;
	Node next;
	Node(int x) {
		data = x;
		next = null;
	}
} */

// class Solution {
// 	public Node deleteMid(Node head) {
// 		// code here
// 		int count = 0;
// 		int mid = 0;
// 		Node temp = head;
// 		while (temp.next != null) {
// 			count++;
// 			temp = temp.next;
// 		}
// 		int mid = count / 2;
// 		temp = head;
// 		int i = 0;
// 		while (i < mid - 1) {
// 			i++;
// 			temp = temp.next;
// 		}
// 		temp.next = temp.next.next;
// 		return head;
// 	}
// }
class Solution {
    public Node deleteMid(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head.next.next;  // 2-step head start

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow is now just before the middle node
        slow.next = slow.next.next;
        return head;
    }
}   
