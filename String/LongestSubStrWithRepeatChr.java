import java.util.*;

class LongestSubStrWithRepeatChr {


    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int left = 0;
        int size = 0;
        int temp = 0;
        int len = s.length();
        for(int i=0; i<len; i++){
            if(set.contains(s.charAt(i))){
                while(s.charAt(left)!=s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                    temp--;
                }
                left++;
            }
            else if(!set.contains(s.charAt(i))){
                temp++;
                set.add(s.charAt(i));
                if(temp > size){
                    size = temp;
                }
            }
        }
        return size;
    }

    public static void main(String [] args){
        String s = "abcabcbcbbpwkelkj";
        System.out.println(lengthOfLongestSubstring(s));
    }

}