class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int curr=0;
        int total=0;
        int s=0;
        int gsum=0;
        int csum=0;
        for (int i = 0; i < gas.length; i++) {
                gsum += gas[i];
                csum += cost[i];
        }
        if(gsum<csum){
            return -1;
        }
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                s=i+1;
            }
        }
        return (total>=0)?s:-1;
        
    }
}