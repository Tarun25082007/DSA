class MyQueue {

    public MyQueue() {
    }
    Stack<Integer> z = new Stack<>();
      Stack<Integer> y = new Stack<>();
    
    public void push(int x) {
    //   while(!z.isEmpty()){
    //     y.push(z.pop());
    //    }
       z.push(x);
    //    while(!y.isEmpty() ){
    //     z.push(y.pop());
    //    }

        
    }
    
    public int pop() {
        if (!y.isEmpty()){
            return y.pop();
        }
        while (!z.isEmpty()){
            y.push(z.pop());
        }
            return y.pop();
       
        // return z.pop();
        
    }
    
    public int peek() {
        // return z.peek();
             if (!y.isEmpty()){
            return y.peek();
        }
        while (!z.isEmpty()){
            y.push(z.pop());}
            return y.peek();
        
    }
    
    public boolean empty() {
            return z.isEmpty() && y.isEmpty() ;
        
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