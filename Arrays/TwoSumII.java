class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length-1;
        // int sum = numbers[0]+numbers[right];
        int[] res = new int[2];

        while(left<=right){
            
            if(numbers[left]+numbers[right]<target){
                left++;
            }
            else if(numbers[left]+numbers[right]>target){
                right--;
            }
            else{
                res[0] = left+1;
                res[1] = right+1;
                break;
            }

        }
        return res;
    }
}

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/?envType=study-plan-v2&envId=top-interview-150
