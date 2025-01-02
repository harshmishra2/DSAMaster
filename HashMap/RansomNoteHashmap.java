
class RansomNoteHashmap{

    public static void main(String [] args){
        String ransomNote = "aa";
        String magazine = "aab";

        System.out.println("So can we construct the ransomNote out of Magazine? -"+ canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<magazine.length(); i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i), map.get(magazine.charAt(i))+1);
            }
            else{
                map.put(magazine.charAt(i), 1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(map.containsKey(ransomNote.charAt(i))){

                if(map.get(ransomNote.charAt(i))<=0){
                    return false;
                }else{
                    map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i))-1);
                }
            }else{
                return false;
            }
        }
        return true;
    }
}


//https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
