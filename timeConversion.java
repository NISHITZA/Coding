import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();
        String str[]=s.split(":");
        int hh=Integer.parseInt(str[0]);
        int mm=Integer.parseInt(str[1]);
        int ss=Integer.parseInt(str[2].substring(0,2));
        String ap=str[2].substring(2,4);
        int h=hh;
        //System.out.println(ap);
        if(ap.equals("AM") && hh==12){
            h=0;
        }
        else if(ap.equals("PM") && hh<12){
            h=hh+12;
        }
        StringBuffer sb = new StringBuffer();
        StringBuffer temp1 = new StringBuffer();
        StringBuffer temp2 = new StringBuffer();
        StringBuffer temp3 = new StringBuffer();
        if(h<10)
            temp1.append("0"+h);
        else
            temp1.append(h);

        if(mm<10)
            temp2.append("0"+mm);
        else
            temp2.append(mm);
            
        if(ss<10)
            temp3.append("0"+ss);
        else
            temp3.append(ss);

        sb.append(temp1+":"+temp2+":"+temp3);
        String result = sb.toString();
        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
