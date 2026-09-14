# Longest Palindromic Substring

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string s, return the longest palindromic substring in s.

 
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.


Example 2:

Input: s = "cbbd"
Output: "bb"


 
Constraints:


	1 <= s.length <= 1000
	s consist of only digits and English letters.

## Solution

**Language:** Python  
**Runtime:** 8514 ms (beats 5.97%)  
**Memory:** 19.4 MB (beats 36.06%)  
**Submitted:** 2026-09-14T09:59:16.615Z  

```py
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)
        best = ""
        for i in range(n):
            for j in range(i, n):
                sub = s[i:j+1]
                if sub == sub[::-1]:
                    if len(sub) > len(best):
                        best = sub
        return best
```

---

[View on LeetCode](https://leetcode.com/problems/longest-palindromic-substring/)