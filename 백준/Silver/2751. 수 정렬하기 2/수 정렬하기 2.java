import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		
		
		int[] numA = new int[N];
		for(int i=0;i<N;i++) {
			numA[i]=Integer.parseInt(br.readLine());
		}
		Arrays.sort(numA);
		
		
		for(int i=0;i<numA.length;i++)
			System.out.println(numA[i]);
	}
}