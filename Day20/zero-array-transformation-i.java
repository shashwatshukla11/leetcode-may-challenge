class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n];
        for(int query[] : queries){
            int st = query[0];
            int end = query[1];
            diff[st]++;
            if(end+1 < n){
                diff[end+1]--;
            }
        }
        int curr = 0;
        for(int i = 0; i < n; i++){
            curr += diff[i];
            if(curr < nums[i]) return false;
        }
        return true;
    }
}
