class Solution {
    public int maxDifference(String S) 
    {
      Map<Character, Integer> map = new HashMap<>();
     char arr[]=S.toCharArray();

     for(int i=0;i<arr.length;i++)
     {
      char ch=arr[i];

      if(map.containsKey(ch))
      {
        map.put(ch,map.get(ch)+1);
      }
      else
      {
        map.put(ch,1);
      }
     }



        Integer maxOdd = null;
        Integer minEven = null;

        for (int value : map.values()) 
        {
            if (value % 2 != 0)
             {  
                if (maxOdd == null || value > maxOdd)
                 {
                    maxOdd = value;
                }
            } 
            else 
            {  
                if (minEven == null || value < minEven) 
                {
                    minEven = value;
                }
            }
        }
        if (maxOdd == null || minEven == null) return -1; 
        return maxOdd - minEven;
            


    }
}
 