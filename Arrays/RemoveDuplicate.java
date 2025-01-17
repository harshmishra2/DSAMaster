class RemoveDuplicate {

    public static void main(String[] args){
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,3};
        for(int i: nums){
            System.out.print(i + " ");
        }
        System.out.println("Number of unique elements "+ removeDuplicates(nums));
        for(int i: nums){
            System.out.print(i + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        int uniq = 0;
        int jump = 0;
        int counter = 1;

        if(size==1){
                return 1;
            }

        while(jump<size){
            
            if(nums[uniq]==nums[jump]){
                jump++;
            }
            else if(nums[uniq]!= nums[jump]){
                uniq++;
                nums[uniq]=nums[jump];
                jump++;
                counter++;
            }
        }
        return counter;
        
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
