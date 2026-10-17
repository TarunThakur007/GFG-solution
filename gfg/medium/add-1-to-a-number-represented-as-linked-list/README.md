# Add 1 to a Linked List Number

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given head of a linked list where each node contains a single digit. The digits together represent a number formed by concatenating the node values in order. Add 1 to this number and return the head of the modified linked list.

 **Examples :** 

```
Input: Head: 4->5->6
Output: 457

Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

```

```
Input: Head: 1->2->3
Output: 124
 
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
```

```
Input: Head: 0->0->1
Output: 002
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T10:09:45.030Z  

```java
/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public int addCarry(Node head) {
        if (head == null) return 1;
        int res = head.data + addCarry(head.next);
        head.data = res % 10;
        return res / 10;
    }
    public Node addOne(Node head) {
        int carry = addCarry(head);
        if (carry > 0) {
            Node newNode = new Node(carry);
            newNode.next = head;
            return newNode;
        }
        return head;
    }
}   
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)