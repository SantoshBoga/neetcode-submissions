class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        int[] arr;
        for (int i=0; i<nums.length; i++) {
            if (m.containsKey(target - nums[i])) {
                res.add(m.get(target - nums[i]));
                res.add(i);
            }
            m.putIfAbsent(nums[i], i);
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
 
    }
}
