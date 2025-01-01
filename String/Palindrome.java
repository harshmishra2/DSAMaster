public class Palindrome {

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";

        System.out.println("Is the given string a palindrome true/false"+isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        // str.toLowerCase();
        System.out.println(str);
        
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
