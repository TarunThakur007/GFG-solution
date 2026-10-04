# Greatest of Three Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given three numbers a, b and c. Find the greatest number among them.

 **Examples:** 

```
Input: a = 10, b = 3, c = 2
Output: 10
Explanation: 10 is greatest among the three 
```

```
Input: a = -4, b = -3, c = -2
Output: -2
Explanation: -2 is greatest among the three
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T05:55:56.015Z  

```java
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // code here
        if(a>b){
            if(a>c){
                System.out.println(a);
            }else{
                System.out.println(c);
            }
        }else{
            if(b>c){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1)