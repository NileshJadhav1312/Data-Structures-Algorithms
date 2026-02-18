class Solution {
    public void reverseQueue(Queue<Integer> q) 
    {
       Stack<Integer> stack=new Stack<>();
       while(!q.isEmpty())
       {
          int ele=q.poll();
          stack.push(ele);
       }
        while(!stack.isEmpty())
       {
          int ele=stack.pop();
          q.add(ele);
       }
    }
}