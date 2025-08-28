class MyQueue {
    Stack<Integer> i=new Stack<>();
    Stack<Integer> o=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        i.push(x);
        
    }
    
    public int pop() {
        if(!o.isEmpty()){
            return o.pop();
        }
        else{
            while(!i.isEmpty()){
                int ele=i.pop();
                o.push(ele);
            }
            return o.pop();
        }
    }
    
    public int peek() {
        if(!o.isEmpty()){
           return o.peek();
        }
        else{
            while(!i.isEmpty()){
                int ele=i.pop();
                o.push(ele);
            }
            return o.peek();
        }
    }
    
    public boolean empty() {
        if(i.isEmpty() && o.isEmpty()){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */