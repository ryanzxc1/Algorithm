import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] original = new int[N];
        int[] sorted = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            original[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }

        
        Arrays.sort(sorted);

        
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 0;
        for (int i = 0; i < sorted.length; i++) {
            int value = sorted[i];
            
            if (!rankMap.containsKey(value)) {
                rankMap.put(value, rank);
                rank++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<original.length;i++) {
        	sb.append(rankMap.get(original[i])+" ");
        }
        
        System.out.println(sb.toString());
       
        br.close();
    }
}