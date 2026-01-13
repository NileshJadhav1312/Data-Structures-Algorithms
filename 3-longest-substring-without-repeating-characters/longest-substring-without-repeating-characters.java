class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
         int maxlength=0;
         for(int i=0;i<s.length();i++)
         {
            StringBuilder temp=new StringBuilder();
            for(int j=i;j<s.length();j++)
            { 
               char ch = s.charAt(j);
                if (temp.toString().contains(String.valueOf(ch))) 
                  {
                      break;  // is substring found same ch them break inner loop
                   }
               else
                {
                     temp.append(ch); //else apend to temp 
                 }
            
            } 
            if(maxlength<temp.length())
            {
                maxlength=temp.length();
            }
         } 
         return maxlength;
    }
}