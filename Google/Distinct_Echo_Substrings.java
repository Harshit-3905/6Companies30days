import java.util.*;

class Solution {
    public int distinctEchoSubstrings(String text) {
        int ans = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            StringBuilder s = new StringBuilder();
            for (int j = i; j < text.length(); j++) {
                s.append(text.charAt(j) + "");
                if (s.length() % 2 == 0) {
                    String t = s.toString();
                    if (!set.contains(t) && check(t)) {
                        ans++;
                        set.add(t);
                    }
                }
            }
        }
        return ans;
    }

    boolean check(String s) {
        int x = s.length() / 2;
        String t = s.substring(0, x);
        String g = s.substring(x);
        if (t.equals(g))
            return true;
        else
            return false;
    }
}