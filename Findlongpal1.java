public class Findlongpal1 {
    public static void main(String[] args) {
        Solution solver = new Solution();
        
        
        String test1 = "babad";
        String test2 = "cbbd";
        String test3 = "a";

       findlongpal1.java
        System.out.println("Input: " + test1 + " -> Output: " + solver.longestPalindrome(test1));
        System.out.println("Input: " + test2 + " -> Output: " + solver.longestPalindrome(test2));
        System.out.println("Input: " + test3 + " -> Output: " + solver.longestPalindrome(test3));
    }
}

class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (isPal(sub) && sub.length() > ans.length()) {
                    ans = sub;
                }
            }
        }
        return ans;
    }

    boolean isPal(String s) {
        int l = 0;
        int n = s.length();
        int r = n - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
