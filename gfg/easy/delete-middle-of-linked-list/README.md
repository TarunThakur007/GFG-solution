# Delete Middle of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a singly linked list, delete the middle of the linked list.

Note:

- If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
- If the input linked list has a single node, then it should return NULL.

 **Examples:** 

```
Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
Explanation:

```

```
Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1
Explaination:

```

```
Input: LinkedList: 7 
Output: <empty linked list>
Explanation: There was only one node and it was deleted.
```

 **Constraints:** 
1 <= number of nodes <= 105
1 <= node->data <= 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T06:55:38.459Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1)