class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int n = s.length();
        int mod = (int) 1e9 + 7;
        int ans = 0;
        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        while(t-- > 0) {
            int z = freq[25];

            for(int i=24; i>=0; i--) {
                freq[i+1] = freq[i];
            }

            freq[0] = z;
            freq[1] = (freq[1] + z) % mod;
        }

        for(int i=0; i<26; i++) {
            ans = (ans + freq[i]) % mod;
        }

        return ans;
    }
}
