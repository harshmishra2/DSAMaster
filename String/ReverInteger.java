class ReverseInteger {
    public int reverse(int x) {

        String s = "";
        boolean iN = false;

        if(x<0){
            x *= -1;
            iN = true;
        }

        while(x!=0){
           s += x%10;
           x /= 10;
        }

        try{
                if(iN){
                return (-1* Integer.parseInt(s));
            }
            // if(Integer.parseInt(s)>Integer.MAX_VALUE){
            //     return 0;
            // }
            else{
                return Integer.valueOf(s);
            }     
        }
        catch(NumberFormatException e){
            return 0;
        }
    }
}

//self made solution so isn't the most efficient will work on this problem again
//https://leetcode.com/problems/reverse-integer/description/
