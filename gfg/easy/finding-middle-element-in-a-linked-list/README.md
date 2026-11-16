# Middle of Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a linked list, You have to return the value of the middle node of the linked list.

- If the number of nodes is odd, return the middle node value.
- If the number of nodes is even, there are two middle nodes, so return the second middle node value.

 **Examples:** 

```
Input: 
   
Output: 3
Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
   
```

```
Input:
   
Output: 7 
Explanation: The given linked list is 2->4->6->7->5->1 so, there are two middle node 6 and 7, return the second middle node as 7.
   
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T06:40:59.315Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1)