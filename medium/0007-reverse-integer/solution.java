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
