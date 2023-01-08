import java.util.*;

class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        if (points.length < 3)
            return points.length;
        for (int i = 0; i < points.length; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    double slope = 0.0;
                    if (points[j][0] - points[i][0] == 0)
                        slope = Double.POSITIVE_INFINITY;
                    else
                        slope = ((points[j][1] - points[i][1]) * 1.0) / (points[j][0] - points[i][0]);
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                    ans = Math.max(ans, map.get(slope));
                }
            }
        }
        return ans + 1;
    }
}