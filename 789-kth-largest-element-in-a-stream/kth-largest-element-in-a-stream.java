class KthLargest {
    public PriorityQueue<Integer> minheap;
    public int n;
    public KthLargest(int k, int[] nums) {
        n=k;
        minheap =new PriorityQueue<>();
        for(int num:nums){
            minheap.add(num);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
    }
    
    public int add(int val) {
        minheap.add(val);
        if(minheap.size()>n){
            minheap.poll();
        }
        return minheap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */