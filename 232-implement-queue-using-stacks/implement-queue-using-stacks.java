class MyQueue {
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    public void transfer(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.peek());
                s1.pop();
            }
        }
    }

    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        transfer();
        int front=s2.peek();
        s2.pop();
        return front;
    }
    
    public int peek() {
        transfer();
        return s2.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty()&&s2.isEmpty();
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