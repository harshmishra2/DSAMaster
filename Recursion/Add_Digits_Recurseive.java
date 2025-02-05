class AddDigitsRecursive {
    public int addDigits(int num) {

        int total = 0;
        
        if(num<10){
            return num;
        }

        while(num!=0){
            total += num%10;
            num /= 10;
            System.out.println(total);
        }

        if(total<10){
            return total;
        }
        
        return addDigits(total);
    }
}

