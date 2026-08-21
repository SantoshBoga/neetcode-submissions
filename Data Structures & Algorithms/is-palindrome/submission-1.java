class Solution {
    public boolean isPalindrome(String s) {
        
        char[] chars = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        int j = chars.length - 1;
        for (int i=0;i<chars.length; i++) {
            if(chars[i]!=chars[j] ){
                System.out.println("Entered");
                return false;
            } else {
                j--;
            }
        }
        return true;
        
    }
}
