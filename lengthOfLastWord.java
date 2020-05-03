public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int lengthOfLastWord(final String A) 
    {
        int count=0;
        int lastcount=0;
        String str=A;
        if(str.length()==0)
            return 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                if(lastcount==0)
                    continue;
                count=lastcount;
                lastcount=0;
            }
            else
            {
                lastcount++;
            }
        }
        return lastcount>0?lastcount:count;
       
        
    }
    
}
