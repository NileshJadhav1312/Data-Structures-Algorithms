class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k)
    {
        if(q.size()<k)
        {
            return q;
            
        }
        Stack<Integer> stack=new Stack<>();
        
        
      
        for(int i=0;i<k;i++)
        {
          int ele=q.poll();
          stack.push(ele);
      
        }
        
        while(!stack.isEmpty())
        {
          int ele=stack.pop();
           q.add(ele);
        }
        
       
        int remaining=q.size()-k;
        
        for(int i=0;i<remaining;i++)
        {
          int ele=q.poll();  
           q.add(ele);
        }
        
        return q;
    }
}


// class Solution {
//     public Queue<Integer> reverseFirstK(Queue<Integer> q, int k)
//     {
//         if(q.size()<k)
//         {
//             return q;
            
//         }
        
//         Queue<Integer> tempqueue=new LinkedList<>();
//         Stack<Integer> stack=new Stack<>();
        
        
//         int i=1;
//         while(i<=k)
//         {
//           int ele=q.poll();
//           stack.push(ele);
//           i++;
//         }
//         while(!stack.isEmpty())
//         {
//           int ele=stack.pop();
//           tempqueue.add(ele);
//         }
//         while(!q.isEmpty())
//         {
//           int ele=q.poll();  
//           tempqueue.add(ele);
//         }
        
//         return tempqueue;
//     }
// }