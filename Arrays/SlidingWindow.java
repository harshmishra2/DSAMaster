class SlidingWindow {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 7};
        int k = 5;
        System.out.println("The maximum avg of consecutive k elements is" + findMaxAverage(nums, k));
    }
    
    public static double findMaxAverage(int[] nums, int k) {

        double result = 0.0;
        for(int i= 0; i<k; i++){
            result += nums[i];
        }
        result /= k;
        double max= result;

        for(int j=k; j<nums.length; j++){
            double sum = result + (double)(nums[j])/k - (double)(nums[j-k])/k;
            if(sum>max){
                max = sum;
            }
            result = sum;
        }
        return max;
    }
}
