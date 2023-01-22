class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            String st = Integer.toString(n, i);
            int s = 0, e = st.length() - 1;
            while (s < e) {
                if (st.charAt(s) != st.charAt(e))
                    return false;
                s++;
                e--;
            }
        }
        return true;
    }
}