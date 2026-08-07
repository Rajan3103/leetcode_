# Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21


 
Constraints:


	-231 <= x <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.2 MB  
**Submitted:** 2026-08-07T16:00:50.568Z  

```java
            x/=10;
            if(r>Integer.MAX_VALUE/10||(r == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }
            if (r < Integer.MIN_VALUE / 10 ||
                (r == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }
        }
            r=r*10+digit;
        return r;
            int digit=x%10;
        while(x!=0){
        int r=0;
class Solution {
    public int reverse(int x) {

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-integer/)