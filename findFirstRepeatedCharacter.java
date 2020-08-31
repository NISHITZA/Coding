/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t;i++){
		    HashMap<Character,Integer> map = new HashMap<>();
		    String str=sc.next();
		    char ch[]=str.toCharArray();
		    int flag=0;
		    for(char c:ch){
		        if(map.containsKey(c)){
		            System.out.println(c);
		            flag=1;break;
		        }
		        else
		            map.put(c,1);
		    }
		    if(flag==0)
		    System.out.println("-1");
		    
		}
	}
}
