class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hash = new HashMap<>();
        String[] arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            String a=arr[i];
            char c= pattern.charAt(i);
           if (hash.containsKey(c)) {
                
                if (!hash.get(c).equals(a)) {
                    return false;
                }}
             else {
               
                if (hash.containsValue(a)) {
                    return false;
                }
            
                hash.put(c,a);
            } 
        }
        return true;
    }
}

/*class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> hm = new HashMap<>();
        String[] words = Arrays.stream(s.split(" ")).
                            toArray(String[]::new);
        
        if(pattern.length()!=words.length){
            return false;
        }

        for(int i= 0; i<pattern.length(); i++){
            if(hm.containsKey(pattern.charAt(i))){

                if(hm.get(pattern.charAt(i))!= words[i].trim()){
                    return false;
                }

            }
        }
        return true;
        
    }
}
*/

//https://leetcode.com/problems/word-pattern/?envType=study-plan-v2&envId=top-interview-150