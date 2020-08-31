/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner sc = new Scanner(System.in);
	    HashMap<Integer,Integer> map=new HashMap<>();
	    int t=sc.nextInt();
	    while(t-->0){
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        for(int i=0;i<a;i++){
	            int val=sc.nextInt();
	            map.put(val,1);
	        }
	        for(int i=0;i<b;i++){
	            int val=sc.nextInt();
	            if(map.containsKey(val)){
	                int rem=map.get(val);
	               // if(rem==2)
	                //continue; if duplicates are present
	                map.put(val,rem+1);
	            }
	        }
	        for(int i=0;i<c;i++){
	            int val=sc.nextInt();
	            if(map.containsKey(val)){
	                int rem=map.get(val);
	                map.put(val,rem+1);
	            }
	        }
	        ArrayList<Integer> al = new ArrayList<>();
	        for(Integer res:map.keySet()){
	            int value=map.get(res);
	            if(value==3){
	                al.add(res);
	            }
	        }
	        Collections.sort(al);
	        if(al.size()==0){
	            System.out.println("-1");
	            break;
	        }
	        for(int i:al){
	            System.out.print(i+" ");
	        } 
	        //System.out.println("");
	        
	    }
	}
}
