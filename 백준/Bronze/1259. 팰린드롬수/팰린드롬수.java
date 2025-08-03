import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	while(true){
    		String numStr=br.readLine();
    		if(numStr.equals("0")) break;
    		StringBuilder sb = new StringBuilder(numStr);
    		String reversedStr= sb.reverse().toString();
    		
    		if(numStr.equals(reversedStr)) {
    			System.out.println("yes");
    		}
    		else {
    			System.out.println("no");
    		}
    	}
      
        br.close();
    }
}