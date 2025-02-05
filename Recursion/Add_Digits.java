class AddDigits {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        else if(num%9==0){
            return 9;
        }
        else{
            return (num%9);
        }
    }
}

//https://leetcode.com/problems/add-digits/
