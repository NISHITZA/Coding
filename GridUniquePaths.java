public class Solution {
    public int uniquePaths(int m, int n) 
    {
        if(m==0 || n==0)
            return 0;
        if(n==1 || m==1)
            return 1;
        int b[][]=new int[m][n];
        
        for(int i=0;i<n;i++)
            b[0][i]=1;
        for(int j=0;j<m;j++)
            b[j][0]=1;
            
        for(int i=1;i<m;i++)
            for(int j=1;j<n;j++)
            {
                b[i][j]=b[i-1][j]+b[i][j-1];
            }
        return b[m-1][n-1];    
    }
}
