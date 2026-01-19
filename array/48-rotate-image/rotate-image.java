class Solution {
    public void rotate(int[][] matrix)
    {
       int row=matrix.length;
       int col=matrix[0].length;   

       for(int i=0;i<row;i++)
       {
           for(int j=i+1;j<col;j++)  
           // j=i+1 will traverse the upper triamguler matrix only also avoid the diagonal elemets
           {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
               
           }
       }

        for(int i=0;i<row;i++)
        {
             int start=0;
             int end=matrix[i].length-1;
        while(start<=end)
        {
            int temp=matrix[i][start];
            matrix[i][start]=matrix[i][end];
            matrix[i][end]=temp;
            start++;
            end--;
        } 
        }

    }

 
}