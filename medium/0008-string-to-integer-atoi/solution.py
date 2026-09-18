class Solution:
    def myAtoi(self, s: str) -> int:
        s = s.strip()
        if len(s) == 0:
            return 0
        sign = 1
        i = 0
        if s[0] == '-':
            sign = -1
            i = 1
        elif s[0] == '+':
            i = 1
        num = 0
        while i < len(s):
            if s[i] < '0' or s[i] > '9':
                break
            num = num * 10 + (ord(s[i]) - ord('0'))
            i += 1
        num = num * sign
        if num > 2**31 - 1:
            return 2**31 - 1
        if num < -2**31:
            return -2**31
        return num