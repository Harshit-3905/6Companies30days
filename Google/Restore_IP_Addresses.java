import java.util.*;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, "", 0, 0, result);
        return result;
    }

    private void backtrack(String s, String ip, int dots, int start, List<String> result) {
        if (dots == 3) {
            if (isValid(s.substring(start))) {
                result.add(ip + s.substring(start));
            }
            return;
        }
        for (int i = start; i < s.length() - 1; i++) {
            if (isValid(s.substring(start, i + 1))) {
                backtrack(s, ip + s.substring(start, i + 1) + ".", dots + 1, i + 1, result);
            }
        }
    }

    private boolean isValid(String s) {
        if (s.length() > 3 || s.length() == 0 || (s.charAt(0) == '0' && s.length() > 1) || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}