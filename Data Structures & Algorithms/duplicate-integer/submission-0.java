class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean dup = false;

        for (int i = 0; i < nums.length; i++){
            int first = nums[i];

            for (int j = i+1; j < nums.length; j++){
                int second = nums[j];
                if (first == second){
                    dup = true;
                }
            
            }
        }
        return dup;
    }
}