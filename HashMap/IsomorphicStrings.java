import java.util.*;

class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<>();

        for(int i= 0; i<s.length(); i++){

            char sc = s.charAt(i);
            char tc = t.charAt(i);
            
            if(!hm.containsKey(sc)){
                if(hm.containsValue(tc)){
                    return false;
                }
                else hm.put(sc, tc);
            }
            else if(hm.containsKey(sc)){
                if(hm.get(sc)!=tc){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String [] args){
        
        String s = "badc";
        String t = "baba";

        System.out.println("Are these strings isomorphic? T/F: "+ isIsomorphic(s, t));
    }
}