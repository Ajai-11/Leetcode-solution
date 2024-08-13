class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<m;i++){
            int max=0;
            for(int j=0;j<n;j++){
              if(max<matrix[j][i])
              max=matrix[j][i];
            }
            for(int j=0;j<n;j++){
                if(matrix[j][i]==-1)
                matrix[j][i]=max;
            }
        }
        return matrix;
    }
}