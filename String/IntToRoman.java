class IntToRoman {

    public static void main(String [] args){
        int num = 3749;
        System.out.println(intToRoman(num));
    }

    public static String intToRoman(int num) {

        StringBuilder sb = new StringBuilder();

        String [] ths = {"", "M", "MM", "MMM"};
        String [] hs = {"", "C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String [] ts = {"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String [] on = {"", "I", "II", "III", "IV", "V", "VI", "VII","VIII","IX"};

        sb.append(ths[num/1000]);
        sb.append(hs[num%1000/100]);
        sb.append(ts[num%100/10]);
        sb.append(on[num%10]);

        return sb.toString();
    }
}
