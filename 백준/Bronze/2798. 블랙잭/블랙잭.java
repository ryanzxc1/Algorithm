import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int N,M;
       int max=0;
       int mindiff=Integer.MAX_VALUE;
       StringTokenizer st = new StringTokenizer(br.readLine());
       N=Integer.parseInt(st.nextToken());
       M=Integer.parseInt(st.nextToken());
       StringTokenizer st1= new StringTokenizer(br.readLine());
       int[] input = new int[N];
       for(int i=0;i<N;i++) {
    	   input[i]=Integer.parseInt(st1.nextToken());
       }
       
       for(int i=0;i<N-2;i++) {
    	   for(int j=i+1;j<N-1;j++) {
    		   for(int k=j+1;k<N;k++) {
    			   int num=0;
    			   int diff=Integer.MAX_VALUE;
    			   num = input[i]+input[j]+input[k];
    			   
    			   if(num<=M) {
    				   diff=M-num;
    			   }
    			   else continue;
    			   if(diff<mindiff) {
    				   mindiff=diff;
    				   max=num;
    				   
    			   }
    		   }
    	   }
       }
       System.out.println(max);
        br.close();
    }
}