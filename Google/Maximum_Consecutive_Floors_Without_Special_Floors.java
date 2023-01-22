import java.util.*;

class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : special)
            set.add(x);
        int ans = 0;
        int c = 0;
        for (int i = bottom; i <= top; i++) {
            if (set.contains(i)) {
                ans = Math.max(ans, c);
                c = 0;
            } else
                c++;
        }
        ans = Math.max(ans, c);
        return ans;
    }
}