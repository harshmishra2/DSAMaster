class lengthOfLastWord {

    public static void main(String [] args){
        String example = "    there is the joyboy who loves and knows what he wants     ";
        System.out.println("the length of the last word of this string is going to be -> " + lengthOfTheLastWord(example));
    }
    public static int lengthOfTheLastWord(String s) {
        
        s = s.trim();
        int end = s.length() -1;

        while(end >=0 && s.charAt(end) != ' '){
            end--;
        }

        return s.length()-end-1;

    }
}