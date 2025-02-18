class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int h = 0;
        int len = citations.length;

        for(int i=0; i<len; i++){
            if(citations[i]>=len-i){
                return len-i;
            }
        }

        return 0;
        
    }
}

//https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
