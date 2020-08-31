/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    HashMap<Integer,Integer> map = new HashMap<>();
		    int count=0;
		    int n=sc.nextInt();
		    int cur=0;
		    map.put(0,1);
		    for(int j=0;j<n;j++){
		        int val=sc.nextInt();
		        cur=cur+val;
		        
		        if(map.containsKey(cur))
		        {
		            count=count+map.get(cur);
		            map.put(cur,map.get(cur)+1);
		        }
		        else{
		            map.put(cur,1);
		        }
		        
		    }
		    System.out.println(count);
		    
		}
	}
}
