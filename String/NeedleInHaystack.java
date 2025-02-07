class NeedleInHaystack {
    public int strStr(String haystack, String needle) {

        int lenH = haystack.length();
        int lenN = needle.length();

        for(int i=0; i<=lenH-lenN; i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                for(int j=0; j<lenN; j++){

                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }

                    if(j==lenN-1 && haystack.charAt(i+j)==needle.charAt(j)){
                        return i;
                    }
                }
            }
        }
        return -1;
        
    }
}

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&envId=top-interview-150
