public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) 
	{
	    int n=a.size();
	    int s=0;
	    int e=n-1;
	    int mid=0;
	    while(s<=e)
	    {
	        mid=(s+e)/2;
	        
	        if(a.get(mid)==b 
	        ||(mid==0 && b<a.get(mid))||
	        (mid>0 && b<a.get(mid)&& b>a.get(mid-1)))
	            return mid;
	       else if(b>a.get(mid))
	            s=mid+1;
	       else
	            e=mid-1;
	    }
	    return n;
	}
}
