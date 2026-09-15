# Zigzag Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R


And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


 
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"


Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I


Example 3:

Input: s = "A", numRows = 1
Output: "A"


 
Constraints:


	1 <= s.length <= 1000
	s consists of English letters (lower-case and upper-case), ',' and '.'.
	1 <= numRows <= 1000

## Solution

**Language:** Python  
**Runtime:** 15 ms (beats 24.64%)  
**Memory:** 19.2 MB (beats 80.20%)  
**Submitted:** 2026-09-15T02:57:32.636Z  

```py
class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or numRows >= len(s):
            return s

        rows = [""] * numRows
        curr_row = 0
        going_down = False

        for char in s:
            rows[curr_row] += char
            if curr_row == 0 or curr_row == numRows - 1:
                going_down = not going_down
            if going_down:
                curr_row += 1
            else:
                curr_row -= 1

        return "".join(rows)
```

---

[View on LeetCode](https://leetcode.com/problems/zigzag-conversion/)