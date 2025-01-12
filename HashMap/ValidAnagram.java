class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), hm.get(s.charAt(i))+1);
            }
            else {
                hm.put(s.charAt(i), 1);
            }
        }

        int tlen = t.length();
        
        for(int i=0; i<tlen; i++){
            if(!hm.containsKey(t.charAt(i))){
                return false;
            }else{

                if(hm.get(t.charAt(i))<=0){
                    return false;
                }

                else {
                    hm.put(t.charAt(i), hm.get(t.charAt(i))-1);
                }
            }
        }
        return true;
    }
}