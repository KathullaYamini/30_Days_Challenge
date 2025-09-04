class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });

        int n = people.length;
        int[][] res = new int[n][2];
        int size = 0;

        for (int[] p : people) {
            int idx = p[1];
            for (int j = size; j > idx; j--) {
                res[j] = res[j - 1];
            }
            res[idx] = p;
            size++;
        }

        return res;
    }
}