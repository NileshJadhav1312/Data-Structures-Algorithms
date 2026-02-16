class MyStack {
 
   Queue <Integer> q1=new LinkedList<>();
   Queue <Integer> q2=new LinkedList<>();

    public MyStack()
    {
    //   int size=100;
    //   int val=0;
    //   int peekele=0;    
    }
    
    public void push(int x) 
    {
        while(!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }
        q1.add(x);
        while(!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }

    }
    
    public int pop()
     {
        int ele=q1.poll();
        return ele;
    }
    
    public int top() 
    {
       int ele=q1.peek();
        return ele;   
    }
    
    public boolean empty()
     {
        return q1.isEmpty();
    } 
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */