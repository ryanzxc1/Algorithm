import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        int N = Integer.parseInt(a);
        int sum=0;
        String numbers= br.readLine();
        
        for(int i=0;i<N;i++) {
        	sum += Character.getNumericValue(numbers.charAt(i));
        }
        System.out.println(sum);
        
    }
}
