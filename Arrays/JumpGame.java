class JumpGame {

    public static void main (String [] args){
        System.out.println("Can we reach the array's last element in the given arrays?");

        int[] normal = {2, 3, 1, 1, 4};
        int [] edge0 = {0};
        int [] edge1 = {1};

        System.out.println(canJump(normal));
        System.out.println(canJump(edge0));
        System.out.println(canJump(edge1));

    }

    public static boolean canJump(int[] nums) {

        int maxReach = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(i>maxReach){
                return false;
            }
            //maxReach = Math.max(maxReach, i + nums[i]);
            if(nums[i]+i>maxReach){
                maxReach = nums[i] + i;
            }
            if(maxReach >= nums.length-1){
                return true;
            }
        }
        return false;
        
    }
}

//https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
