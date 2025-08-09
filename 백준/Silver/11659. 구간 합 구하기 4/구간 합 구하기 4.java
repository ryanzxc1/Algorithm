import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int input[] = new int [N+1];
    	int accumulatedSum[] = new int [N+1];
    	
    	st = new StringTokenizer(br.readLine());
    	accumulatedSum[0]=0;
    	for(int i=1;i<=N;i++) {
    		input[i]=Integer.parseInt(st.nextToken());
    		accumulatedSum[i]=accumulatedSum[i-1]+input[i];
    		
    	}
    	
    	for(int t=0;t<M;t++) {
    		int sum=0;
    		st = new StringTokenizer(br.readLine());
    		int i= Integer.parseInt(st.nextToken());
    		int j= Integer.parseInt(st.nextToken());
    		sum = accumulatedSum[j]-accumulatedSum[i-1];
    		sb.append(sum+"\n");
    	}
    	
    	System.out.println(sb.toString());
    }
}	