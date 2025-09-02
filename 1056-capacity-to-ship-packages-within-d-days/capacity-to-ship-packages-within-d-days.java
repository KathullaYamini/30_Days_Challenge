class Solution {
    public int max(int[] a){
        int m=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
    public int sum(int[] a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public int f(int cap,int[] weights){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=0;
            }
            load+=weights[i];
        }
        return days;
                }
    public int shipWithinDays(int[] weights, int days) {
        int low=max(weights);
        int high=sum(weights);
        int mid=0;
        while(low<=high){
         mid=(low+high)/2;
        int reqdays=f(mid,weights);
        if(reqdays<=days){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
        }
        return low;
    }
}