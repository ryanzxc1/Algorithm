import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int max =Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        for(int i=0;i<N;i++) {
        	int num = Integer.parseInt(input[i]);
        	if(num>max)
        		max = num;
        	if(num < min)
        		min = num;
        }
        
       
        
        System.out.println(min+ " "+ max);
        
        
    }
}