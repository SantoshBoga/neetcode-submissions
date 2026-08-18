class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (Integer num : nums) {
            if (uniques.contains(num)) {
                return true;
            }
            else {
                uniques.add(num);
            }
        }
        return false;
    }
}