class Solution {
    public int trailingZeroes(int n) {
        int c=0;
        int x=5;
        while(n/x > 0)
        {
            c+=(n/x);
            x*=5;
        }
        return c;
    }
}