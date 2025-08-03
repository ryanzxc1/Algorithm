import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	double total=0;
    	
    	int maxVal=0;
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int[] score = new int[N];
    	for(int i=0;i<N;i++) {
    		score[i]= Integer.parseInt(st.nextToken());
    	}
    	
    	maxVal= Arrays.stream(score).max().getAsInt();
    	
    	for(int i=0;i<N;i++) {
    		total +=(double) score[i]/maxVal*100;
    		
    	}
    	System.out.println(total/N);
        br.close();
    }
}