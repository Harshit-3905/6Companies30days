class Solution {
    public double dist(int[] p1, int[] p2) {
        return (Math.pow(p2[0] - p1[0], 2) + Math.pow(p2[1] - p1[1], 2));
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        double s1, s2, s3, s4, d1, d2;

        s1 = dist(p1, p2);
        s2 = dist(p2, p3);
        s3 = dist(p3, p4);
        s4 = dist(p4, p1);
        if ((s1 == s2) && (s2 == s3) && (s3 == s4) && (s1 != 0)) {
            d1 = dist(p1, p3);
            d2 = dist(p2, p4);
            if ((d1 == d2) && (d1 != 0))
                return true;
        }

        s1 = dist(p1, p2);
        s2 = dist(p2, p4);
        s3 = dist(p3, p4);
        s4 = dist(p3, p1);
        if ((s1 == s2) && (s2 == s3) && (s3 == s4) && (s1 != 0)) {
            d1 = dist(p1, p4);
            d2 = dist(p2, p3);
            if ((d1 == d2) && (d1 != 0))
                return true;
        }

        s1 = dist(p1, p3);
        s2 = dist(p3, p2);
        s3 = dist(p2, p4);
        s4 = dist(p4, p1);
        if ((s1 == s2) && (s2 == s3) && (s3 == s4) && (s1 != 0)) {
            d1 = dist(p1, p2);
            d2 = dist(p3, p4);
            if ((d1 == d2) && (d1 != 0))
                return true;
        }

        return false;
    }
}