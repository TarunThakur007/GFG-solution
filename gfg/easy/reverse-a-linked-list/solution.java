/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	
	Node(int x) {
		data = x;
		next = null;
	}
}
*/

class Solution {
	Node reverseList(Node head) {
		// code here
		Node prev = null;
		Node current = head;
		Node nextNode = null;
		while (current != null) {
			nextNode = current.next; 
			current.next = prev; 
			prev = current; 
			current = nextNode; 
		}
		
		return prev;
	}
}
