class Solution {
    public int countLargestGroup(int n) 
    {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int max=0;
        HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int val=sum(i);
            if(hm.containsKey(val))
            {
                hm.put(val,hm.get(val)+1);
            }
            else
                hm.put(val,1);            
        }
        for(int i:hm.values())
        {
            if(i>max)
            {
                max=i;
            }
        }
        for(int i:hm.values())
        {
            if(i==max)
            {
                count++;
            }
        }
        
        return count;
    }
    static int sum(int n)
    {
        int res=0;
        while(n>0)
        {
            res=res+(n%10);
            n=n/10;
        }
        return res;
    }
}
