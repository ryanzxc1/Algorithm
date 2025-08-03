import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringBuilder sb = new StringBuilder();
       
       int N;
       int num=0;
       N= Integer.parseInt(br.readLine());
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int[] input = new int[N];
       for(int i=0;i<N;i++) {
    	   int cnt=0;
    	   input[i]=Integer.parseInt(st.nextToken());
    	   for(int j=1;j<=input[i];j++) {
    		   if(input[i]%j==0) cnt++;
    		   
    	   }
    	   if(cnt==2) num++;
       }
      
       System.out.println(num);
        br.close();
    }
}