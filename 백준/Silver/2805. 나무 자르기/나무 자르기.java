import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Long.parseLong(st.nextToken()); 
        
        int arr[]= new int[N];
        st= new StringTokenizer(br.readLine());
        int maxTreeHeight = 0;
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] > maxTreeHeight) {
                maxTreeHeight = arr[i]; 
            }
        }
        
        long result = binarySearch(arr,N, M, maxTreeHeight);
        System.out.println(result);
    }

    public static long binarySearch(int[] arr, int N,long M, int maxTreeHeight) {
    	long low = 0;
    	long high = maxTreeHeight;
    	long result = 0;
        
    	while(low <= high) {
    		long mid = (low + high) / 2;
    		long totalCutLength = 0;
            
    		for (int i = 0; i < N; i++) {
                if (arr[i] > mid) {
                    totalCutLength += arr[i] - mid;
                }
            }

            
    		if(totalCutLength >= M) {
    			
    			result = mid; 
    			low = mid + 1; 
    		} else {
    			
    			high = mid - 1; 
    		}
    	}
        
    	return result;
    }
    
}