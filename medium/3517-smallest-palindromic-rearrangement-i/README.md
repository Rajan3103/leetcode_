# Smallest Palindromic Rearrangement I

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a palindromic string s.

Return the lexicographically smallest palindromic permutation of s.

 
Example 1:


Input: s = "z"

Output: "z"

Explanation:

A string of only one character is already the lexicographically smallest palindrome.


Example 2:


Input: s = "babab"

Output: "abbba"

Explanation:

Rearranging "babab" → "abbba" gives the smallest lexicographic palindrome.


Example 3:


Input: s = "daccad"

Output: "acddca"

Explanation:

Rearranging "daccad" → "acddca" gives the smallest lexicographic palindrome.


 
Constraints:


	1 <= s.length <= 105
	s consists of lowercase English letters.
	s is guaranteed to be palindromic.

## Solution

**Language:** Java  
**Runtime:** 36 ms (beats 25.30%)  
**Memory:** 48 MB (beats 88.35%)  
**Submitted:** 2026-07-28T05:04:49.489Z  

```java
class Solution {
    public String smallestPalindrome(String s) {
        int[]freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder first=new StringBuilder();
        StringBuilder middle=new StringBuilder();

        for(int i=0;i<26;i++){
            if((freq[i] & 1)==1){
                middle.append((char)('a'+i));
            }
            for(int j=0;j<freq[i]/2;j++){
                first.append((char)('a'+i));
            }
        }
        String second=new StringBuilder(first).reverse().toString();

        return first.toString()+ middle.toString() + second;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-i/)