# Merge Two Sorted Linked Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given the  **head**  of two sorted linked lists consisting of nodes respectively. Merge both lists and return the head of the sorted merged list.

 **Examples:** 

```
Input:
  
Output: 2 -> 3 -> 5 -> 10 -> 15 -> 20 -> 40
Explanation:
   
```

```
Input:
  
Output: 1 -> 1 -> 2 -> 4
Explanation:
  
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T10:20:22.461Z  

```java
/*  Structure of Linked List Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
} */

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node ans = new Node(0);
        Node t = ans;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                t.next=head1;
                head1=head1.next;
            }else{
                t.next=head2;
                head2=head2.next;
            }
            t=t.next;
        }
        t.next = (head1 != null) ? head1 : head2;
        return ans.next;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1)