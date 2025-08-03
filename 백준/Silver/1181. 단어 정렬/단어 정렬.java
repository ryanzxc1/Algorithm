import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int N = Integer.parseInt(br.readLine());
    	Set<String> wordSet= new HashSet<>();
    	for(int i=0;i<N;i++)
    		wordSet.add(br.readLine());
    	
    	String[] words = wordSet.toArray(new String[0]);
    	Arrays.sort(words, (x,y)-> {
    		if(x.length()!=y.length()) {
    			return x.length()-y.length();
    		}
    		else {
    			return x.compareTo(y);
    		}
    	});
    	for(int i=0;i<words.length;i++)
    		System.out.println(words[i]);
        br.close();
    }
}