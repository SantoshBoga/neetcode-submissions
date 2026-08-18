class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        String str1 = new String(s1);
        
        char[] t1 = t.toCharArray();
        Arrays.sort(t1);
        String tr1 = new String(t1);

        if (str1.equals(tr1)) {
            return true;
        }
        return false;

    }
}
