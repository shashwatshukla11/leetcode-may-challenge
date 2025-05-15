class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> list=new ArrayList<>();
        int n=groups.length;
        if(n==1){
            list.add(words[0]);
        }
        if(n>1){
        list.add(words[0]);
        for(int i=1;i<n;i++){
            if(groups[i]!=groups[i-1]){
                list.add(words[i]);
            }
        }
        }
        return list;
        
    }
}
