class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (hm.containsKey(val) && i - hm.get(val) <= k) {
                return true;
            }
            hm.put(val, i);

        }
        return false;
    }
}
/*
 * class Solution {
 * public boolean containsNearbyDuplicate(int[] nums, int k) {
 * 
 * HashSet<Integer> set = new HashSet<>();
 * int left = 0;
 * 
 * if(nums.length==1){
 * return true;
 * }
 * 
 * for(int i=0; i<=k; i++){
 * 
 * if(set.contains(nums[i])){
 * return true;
 * }
 * 
 * set.add(nums[i]);
 * 
 * }
 * 
 * for(int i= k+1; i<nums.length; i++){
 * set.remove(nums[left]);
 * left++;
 * if(set.contains(nums[i])){
 * return true;
 * }
 * 
 * set.add(nums[i]);
 * }
 * 
 * return false;
 * 
 * }
 * }
 */