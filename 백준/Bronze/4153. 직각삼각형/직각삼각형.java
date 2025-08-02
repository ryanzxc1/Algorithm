import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int[] s= new int[3];
        	s[0] =Integer.parseInt(st.nextToken());
        	s[1]= Integer.parseInt(st.nextToken());
        	s[2]= Integer.parseInt(st.nextToken());
        	Arrays.sort(s);
        	if(s[0]==0 && s[1]==0 &&s[2]==0) break;
        	if(s[2]*s[2] == s[0]*s[0] +s[1]*s[1]) {
        		sb.append("right\n");
        		
        	}
        	else {
        		sb.append("wrong\n");
        	}
        }
        System.out.println(sb.toString());
        
        br.close();
    }
}