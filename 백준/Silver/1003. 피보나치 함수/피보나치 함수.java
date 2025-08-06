import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int[] cnt0 ;
	static int[] cnt1 ;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		cnt0=new int[41];
		cnt1=new int[41];
		calculatorFibonacciCounts();
		for(int i=0;i<N;i++) {
			
			int num = Integer.parseInt(br.readLine());
			sb.append(cnt0[num]+" "+cnt1[num]+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
	public static void calculatorFibonacciCounts() {
		cnt0[0]=1;
		cnt0[1]=0;
		cnt1[0]=0;
		cnt1[1]=1;
		for(int i=2;i<=40;i++) {
			cnt0[i]=cnt0[i-1]+cnt0[i-2];
			cnt1[i]=cnt1[i-1]+cnt1[i-2];
		}
	}
}

