class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean prime[] = new boolean[right + 1];
        for (int i = 0; i <= right; i++)
            prime[i] = true;

        for (int p = 2; p * p <= right; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= right; i += p)
                    prime[i] = false;
            }
        }
        prime[1] = false;
        int min = Integer.MAX_VALUE;
        int ans[] = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        boolean flag = false;
        int x = 0;
        for (int i = left; i <= right; i++) {
            if (prime[i] == true && flag) {
                if (i - x < min) {
                    min = i - x - 1;
                    ans[0] = x;
                    ans[1] = i;
                    x = i;
                } else {
                    x = i;
                }
            } else if (prime[i]) {
                flag = true;
                x = i;
            }
        }
        return ans;
    }
}