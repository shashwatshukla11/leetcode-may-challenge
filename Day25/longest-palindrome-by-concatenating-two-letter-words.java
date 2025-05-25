class Solution {
    public int longestPalindrome(String[] words) {


        int[][]newmati=new int[26][26];
        int ans=0;
         for(int i=0;i<words.length;i++){
            int n1=words[i].charAt(0)-97;
            int n2=words[i].charAt(1)-97;
            if(newmati[n2][n1]>=1){
                newmati[n2][n1]--;
                ans+=4;
            }else{
                newmati[n1][n2]++;
            }
         }
         for(int i=0;i<26;i++){
            if(newmati[i][i]>=1){
                return ans+2;
            }
         }
         return ans;
    }
}
