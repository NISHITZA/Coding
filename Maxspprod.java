public class Solution {
    public int maxSpecialProduct(int[] a) 
    {
        int result=0;
        int max=0;
        int n=a.length;
        int leftmax=0;
        int rightmax=0;
        double temp;
        for(int i=1;i<n-1;i++)
        {   
            leftmax=0;
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]>a[i])
                {
                    leftmax=j;
                    break;
                }
            }
            rightmax=0;
            for(int k=i+1;k<n;k++)
            {
                if(a[k]>a[i])
                {
                    rightmax=k;
                    break;
                }
            }
            max=leftmax*rightmax;
            if(max>=result)
                result=max;
        }

        return result%1000000007;
        
    }
}
