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


class ReverseInteger {
    public int reverse(int x) {

        long finalSum = 0;
        boolean isNegat = false;
        if(x<0){
            isNegat = true;
        }

        while(x!=0){
            finalSum *= 10;
            finalSum += x%10;
            x /= 10;
        }

        if(finalSum>Integer.MAX_VALUE || finalSum<Integer.MIN_VALUE){
            return 0;
        }
        else{
            if(isNegat){
                return (int)finalSum;
            }else{
                return (int)finalSum;
            }
        }
        
    }
}

//the second code is much more optimised compared to the first one.
