class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> mh=new PriorityQueue<>(
            (a,b)->(a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1])
        );
        for(int[] p:points){
            mh.add(p);
        }
        int[][] res=new int[k][2];
        for(int i=0;i<k;i++){
            res[i]=mh.poll();
        }
        return res;
    }
}