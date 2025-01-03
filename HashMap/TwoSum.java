import java.util.*;

class TwoSum {

    public static void main (String [] args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i: twoSum(arr, 4)){
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = {0,1};
        
        for(int i= 0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i= 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i]) && i!= map.get(target-nums[i])){
                res[0]=i;
                res[1]=map.get(target-nums[i]);
                break;
            }
        }
        return res;
    }
}