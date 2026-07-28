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