import java.util.*;

class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ch)
                    ans.append(s.charAt(j) + "");
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (order.indexOf(s.charAt(i)) == -1)
                ans.append(s.charAt(i) + "");
        }
        return ans.toString();
    }
}