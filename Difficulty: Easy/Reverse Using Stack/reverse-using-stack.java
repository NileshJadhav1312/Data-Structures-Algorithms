class Solution {
    public String reverse(String S) 
    {   
        StringBuilder answer=new StringBuilder();
        
        char arr[] = new char[S.length()];
        int top=0;
        
        for(int i=0;i<S.length();i++)
        {
          char ch=S.charAt(i);
          arr[top]=ch;
          top++;
        }
        
        for(int j=top-1;j>=0;j--)
        {
           answer.append(arr[j]);
           
        }
        
        return answer.toString();
    }
}