# Smallest Palindromic Rearrangement II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a palindromic string s and an integer k.

Return the k-th lexicographically smallest palindromic permutation of s. If there are fewer than k distinct palindromic permutations, return an empty string.

Note: Different rearrangements that yield the same palindromic string are considered identical and are counted once.

 
Example 1:


Input: s = "abba", k = 2

Output: "baab"

Explanation:


	The two distinct palindromic rearrangements of "abba" are "abba" and "baab".
	Lexicographically, "abba" comes before "baab". Since k = 2, the output is "baab".



Example 2:


Input: s = "aa", k = 2

Output: ""

Explanation:


	There is only one palindromic rearrangement: "aa".
	The output is an empty string since k = 2 exceeds the number of possible rearrangements.



Example 3:


Input: s = "bacab", k = 1

Output: "abcba"

Explanation:


	The two distinct palindromic rearrangements of "bacab" are "abcba" and "bacab".
	Lexicographically, "abcba" comes before "bacab". Since k = 1, the output is "abcba".



 
Constraints:


	1 <= s.length <= 104
	s consists of lowercase English letters.
	s is guaranteed to be palindromic.
	1 <= k <= 106

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-07-29T06:09:43.840Z  

```java
                    }
                        half[c]++;
                        k -= ways;
                    } else {
                        break;
                        first.append((char) (c + 'a'));
                    if(ways >= k) {

                    long ways=getWays(half,k);
                    half[c]--;
            for(int c=0;c<26;++c){
                if(half[c]>0){
                }
            }
        }
        
        StringBuilder res = new StringBuilder(first);
        res.append(mid);
        res.append(first.reverse());

```

---

[View on LeetCode](https://leetcode.com/problems/smallest-palindromic-rearrangement-ii/)