import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = br.readLine();
        int a = Integer.parseInt(input);
        
        for(int i=0;i<a;i++) {
        	for(int j=0;j<a-1-i;j++) {
        		System.out.print(" ");
        	}
        	for(int j=0;j<i+1;j++) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }

        
    }
}
