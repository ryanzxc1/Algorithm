import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N,T,P;
        N= Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        T=Integer.parseInt(st1.nextToken());
        P=Integer.parseInt(st1.nextToken());
        int[] num = new int[6];
        
        int tsb=0;
        int a,b;
        
        for(int i=0;i<6;i++) {
        	num[i]=Integer.parseInt(st.nextToken());
        	int k=0;
        	if(num[i]%T!=0)
        		k= num[i]/T+1;
        	else if(num[i]%T==0)
        		k=num[i]/T;
        	tsb+=k;
        }
        a=N/P;
        b=N%P;
        System.out.println(tsb);
        System.out.println(a +" "+ b);
        br.close();
    }
}