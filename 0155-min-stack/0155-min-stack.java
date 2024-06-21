class MinStack {
          Stack<Integer> st;
    Stack<Integer> st1=new Stack<>();
    public MinStack() {
         st=new Stack<>();
    }
    
   // st=new Stack<>();
    
   
    public void push(int val) {
        st.push(val);
        if(st1.size()==0)
        {
            st1.push(val);
        }
        else
        {
            if(val<=st1.peek())
            {
                st1.push(val);
            }
        }
    }
    
    public void pop() {
        int poppedvalue=st.pop();
        if(poppedvalue==st1.peek())
        {
            st1.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return st1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */