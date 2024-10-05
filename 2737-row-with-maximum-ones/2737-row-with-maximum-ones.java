class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
       int x=0;int y=0;
        for(int i=0;i<mat.length;i++)
        {
            int c=mat[i][0];
            for(int j=1;j<mat[0].length;j++)
            {
                mat[i][j]+=c;
                c=mat[i][j];
            }
            if(c>x)
            {
                x=c;
                y=i;
            }
        }
        return new int[]{y,x};  
    }
}