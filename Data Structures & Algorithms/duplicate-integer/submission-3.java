class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> newSet = new HashSet<>();
        boolean result = false;
        for (int num: nums){
            newSet.add(num);
        }
        if (newSet.size() != nums.length){
            result = true;
        }

        return result;
    }
}