import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        
        
        Arrays.sort(num);//오름차순이 되어 있어야 이분탐색(binary search)가능
        
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            
           
            if (binarySearch(num, target)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        
        System.out.print(sb.toString());
        br.close();
    }
    
    
    public static boolean binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        
        
        while(low <=high) {
        	int mid = (low + high)/2;
        	if(arr[mid]==target)
        		return true;
        	else if(arr[mid]<target)
        		low= mid+1;
        	else //arr[mid]>target
        		high = mid-1;
        }
        
        
        return false;
    }
}
