class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        for (String t : words) {
            int ind = -1;
            boolean flag = true;
            for (int j = 0; j < t.length(); j++) {
                char ch = t.charAt(j);
                if (s.indexOf(ch, ind) == -1) {
                    flag = false;
                    break;
                } else
                    ind = s.indexOf(ch, ind) + 1;
            }
            if (flag) {
                ans++;
                System.out.println(t);
            }
        }
        return ans;
    }
}