class Solution {
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }

    private String process(String str) {
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c != '#') {
                sb.append(c);
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        return sb.toString();
    }
}
// class Solution {
//     public boolean backspaceCompare(String s, String t)
//     {
//         StringBuilder s1=new StringBuilder();
//           StringBuilder t1=new StringBuilder();
//      for(int i=0;i<s.length();i++)
//      {
//         if(s.charAt(i)!='#')
//         {
//             s1.append(s.charAt(i));
//         }
//         else{
//             s1.deleteCharAt(s1.length() - 1);
//         }
//      }  
//      for(int i=0;i<t.length();i++)
//      {
//         if(t.charAt(i)!='#')
//         {
//             t1.append(t.charAt(i));
//         }
//         else{
//             t1.deleteCharAt(t1.length() - 1);
//         }
//      }   
//      return s1.toString().equals(t1.toString());

//     }
// }