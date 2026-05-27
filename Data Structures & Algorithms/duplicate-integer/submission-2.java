class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean result = false;

        for (int i = 0; i < nums.length; i++){
            int first = nums[i];
            for (int j =i+1; j < nums.length; j++){
                int second = nums[j];
                if (first == second){
                    result = true;
                }
            }
        }
        return result;
    }
}