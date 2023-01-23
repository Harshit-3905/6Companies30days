import java.util.*;

class Solution {
    public int totalFruit(int[] f) {
        int i = 0, j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        while (j < f.length) {
            if (map.containsKey(f[j]))
                map.put(f[j], map.get(f[j]) + 1);
            else {
                if (map.size() < 2)
                    map.put(f[j], 1);
                else if (map.size() == 2) {
                    while (map.size() == 2) {
                        if (map.get(f[i]) == 1)
                            map.remove(f[i]);
                        else
                            map.put(f[i], map.get(f[i]) - 1);
                        i++;
                    }
                    map.put(f[j], 1);
                }
            }
            ans = Math.max(j - i + 1, ans);
            j++;
        }
        return ans;
    }
}