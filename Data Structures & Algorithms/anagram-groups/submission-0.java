class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> group = new ArrayList<String>();
        HashMap<String, List<String>> map = new HashMap<>();

        if (strs.length == 1) {
            group.add(strs[0]);
            res.add(group);
            return res;
        }

        for (int i=0; i<strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            if (map.containsKey(new String(chars))) {
                List<String> subGroup = map.get(new String(chars));
                subGroup.add(strs[i]);
            } else {
                List<String> group1 = new ArrayList<String>();
                group1.add(strs[i]);
                map.put(new String(chars), group1);
            }
        }

        for (String key : map.keySet()) {
            res.add(map.get(key));
        }
        return res;
    
    }
}
