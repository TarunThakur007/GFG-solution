/* Structure of Linked List Node
class Node {
	int data;
	Node next;
	Node(int x) {
		this.data = x;
		this.next = null;
	}
} */
class Solution {
	public Node insertPos(Node head, int pos, int val) {
		// code here
		Node newNode = new Node(val);
		Node temp = head;
		int count = 1;
		if (pos == 1) {
			newNode.next = head;
			return newNode;
		}
		while (temp.next != null && count<pos - 1) {
			count++;
			temp = temp.next;
		}
		if (temp == null)
			return head;
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
}
