class JumpGameII {
    public int jump(int[] nums) {

        int len = nums.length;
        int jump = 0;
        int farthest = 0;
        int left = 0;
        int right = 0;

        while (right < len - 1) {

            for (int i = left; i <= right; i++) {
                farthest = Math.max(i + nums[i], farthest);
            }
            left = right + 1;
            right = farthest;

            jump++;

        }
        return jump;
    }
}

//https://leetcode.com/problems/jump-game-ii/description/?envType=study-plan-v2&envId=top-interview-150
