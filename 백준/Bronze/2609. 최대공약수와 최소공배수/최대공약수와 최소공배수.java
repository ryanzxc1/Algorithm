import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	int Mcd=0;
    	int Lcd=0;
    	if(M>=N) {
    		int tmp=0;
    		tmp= N;
    		N= M;
    		M=tmp;
    	}//N이 더큰 수
    	for(int i=1;i<=M;i++) {
    		if(N%i==0 && M%i==0) {
    			Mcd = i;
    		}
    	}
    	int i=0;
    	
    	/*
    	while(true) {
    		i+=1;
    		Lcd= M*i;
    		if(Lcd%N==0)break;
    	}
    	*/
    	
    	Lcd=(N*M/Mcd);
    	 
    	System.out.println(Mcd+"\n"+Lcd);
    }
}