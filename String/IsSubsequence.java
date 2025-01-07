class IsSubsequence {

    public static void main(String [] args){
        String s = "ace";
        String t = "abcghpde";
        System.out.println("Does the string contain the given subsequence"+isSubsequence(s, t));
    
    }
    
    public static boolean isSubsequence(String s, String t) {

        int sp = 0;
        int tp = 0;

        while(sp<s.length() & tp<t.length()){
            if(s.charAt(sp)== t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp == s.length();
    }
}

//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150
