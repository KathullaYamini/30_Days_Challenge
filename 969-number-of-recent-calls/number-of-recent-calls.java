class RecentCounter {
    int[] a=new int[100000];
    int s=0;
    int e=0;
        

    public RecentCounter() {
       
    }
    
    public int ping(int t) {
        while(s<e && t-a[s]>3000){
            s++;
        }
        a[e++]=t; 
        return e-s;       
    }

}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */