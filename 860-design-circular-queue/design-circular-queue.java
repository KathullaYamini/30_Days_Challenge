class MyCircularQueue {
     int[] q;    
     int f=0;    
     int r=0;
     int size;
     int capacity;
    public MyCircularQueue(int k) {
        q=new int[k];
        capacity=k;
       
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        q[r]=value;
        r=(r+1)%capacity;
        size++;
        return true;

    }
    
    public boolean deQueue() {
       if(isEmpty()){
        return false;
       }
       f=(f+1)%capacity;
       size--;
       return true;

        
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return q[f];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return q[(r-1+capacity)%capacity];
        
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */