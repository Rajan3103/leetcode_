# Median of Two Sorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 
Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.


Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


 
Constraints:


	nums1.length == m
	nums2.length == n
	0 <= m <= 1000
	0 <= n <= 1000
	1 <= m + n <= 2000
	-106 <= nums1[i], nums2[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 47.41%)  
**Memory:** 49.2 MB (beats 5.18%)  
**Submitted:** 2026-08-03T08:05:05.895Z  

```java
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merged= new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while (i < nums1.length && j < nums2.length){
            if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }else{
                merged[k++]=nums2[j++];
            }
        }
        while (i < nums1.length) {
           merged[k++] = nums1[i++];
       }
       while (j < nums2.length) {
           merged[k++] = nums2[j++];
       }
       int m = merged.length;

       if (m % 2 == 1) {
           return merged[m / 2];
       }

       return (merged[m / 2] + merged[(m / 2) - 1]) / 2.0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/median-of-two-sorted-arrays/)