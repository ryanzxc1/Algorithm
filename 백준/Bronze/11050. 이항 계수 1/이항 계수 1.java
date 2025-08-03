import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
	public static int factorial(int n) {
		if(n==0||n==1) return 1;
		int result=1;
		for(int i=2;i<=n;i++)
			result*=i;
		return result;
	}
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int K = Integer.parseInt(st.nextToken());
    	int a,b;
    	a=factorial(N);
    	b=factorial(K)*factorial(N-K);
    	int result=a/b;
    	System.out.println(result);
    	
    	br.close();
    }
}