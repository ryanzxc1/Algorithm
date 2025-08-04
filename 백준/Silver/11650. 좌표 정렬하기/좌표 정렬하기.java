import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
           
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken()); // x 좌표
            coordinates[i][1] = Integer.parseInt(st.nextToken()); // y 좌표
        }

        
        Arrays.sort(coordinates, (p1, p2) -> {
            if (p1[0] == p2[0]) {
               
                return p1[1] - p2[1];
            } else {
                
                return p1[0] - p2[0];
            }
        });//오름차순 정렬
       
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(coordinates[i][0]).append(" ").append(coordinates[i][1]).append("\n");
        }
        System.out.print(sb);
    }
}