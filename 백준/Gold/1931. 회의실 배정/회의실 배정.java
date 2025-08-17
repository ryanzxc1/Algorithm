import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int N = Integer.parseInt(br.readLine());
        
        
        int[][] meetings = new int[N][2];
        
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            meetings[i][0] = Integer.parseInt(st.nextToken()); // 시작 시간
            meetings[i][1] = Integer.parseInt(st.nextToken()); // 끝나는 시간
        }
        
        
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];//양수면 o2가 o1앞으로 음수면 o1이 o2앞으로
            }
        });
        
        int count = 0;
        int lastEndTime = 0;
        
        for (int i = 0; i < N; i++) {
            
            if (meetings[i][0] >= lastEndTime) {
                count++;
                lastEndTime = meetings[i][1];
            }
        }
        
        System.out.println(count);
    }
}