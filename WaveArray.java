public class Solution {
    public int[] wave(int[] a) {
            Arrays.sort(a);
            int n=a.length;
            int b[]=new int[n];
            int i=0;
            int j=1;
            int k=0;
            while(i<n & j<n)
            {
                b[k]=a[j];
                k++;
                b[k]=a[i];
                k++;
                i=i+2;
                j=j+2;
            }
            if(i<n)
                b[k]=a[i];
            if(j<n)
                b[k]=a[j];
            return b;
    }
}
