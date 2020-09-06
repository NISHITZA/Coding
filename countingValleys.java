import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int count =0;
        char ch[] = s.toCharArray();
        int cur=0;
        int flag=0;
        for( int i=0;i<s.length();i++){

            if(ch[i]=='D'){
                cur--;
            }
            else if(ch[i]=='U'){
                cur++;
            }
            
            if(cur<0 && flag==0){
                count++;
                flag=1;
            }
            if(flag==1 && cur>=0){
                flag=0;
            }

        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
