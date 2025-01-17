class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null){
            return "";
        }

        String prefix = strs[0];
        int len = strs[0].length();

        for(int i = 1; i< strs.length; i++){
            String s = strs[i];

            while(len>s.length() || !prefix.equals(s.substring(0, len))){

                len--;
                if(len == 0){
                    return "";
                }
                prefix = prefix.substring(0, len);

            }

        }
        return prefix;
        
    }
}

//