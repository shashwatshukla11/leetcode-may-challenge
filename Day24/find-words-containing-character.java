class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> myarr = new ArrayList<>();

        int count = 0;
        for(String ch : words)
        {
            if(ch.contains(String.valueOf(x)))
            {
                myarr.add(count);
            }
            count++;
        }
        return myarr;
    }
}
