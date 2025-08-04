import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int mincnt=Integer.MAX_VALUE;
        char[][] coordinates = new char[N][M];

        for (int i = 0; i < N; i++) {
            String inputString = br.readLine();
            coordinates[i]=inputString.toCharArray();
        }

        for(int i=0;i<=N-8;i++) {
        	for(int j=0;j<=M-8;j++) {
        		int cnt1=0;
        		int cnt2=0;
        		//맨 왼쪽 위가 B인경우
        		for(int a=0;a<8;a++) {
        			for(int b=0;b<8;b++) {
        				if((a%2==0&&b%2==0)||(a%2==1&&b%2==1)) {//B자리
        					if(coordinates[i+a][j+b]=='B') {
        					}//B자리에 B
        					else cnt1++;//B자리에 W
        				}
        				else//W자리
        					if(coordinates[i+a][j+b]=='W') {
        						
        					}//W자리에W
        					else cnt1++;//W자리에B
        			}
        		}
        		//맨 왼쪽 위가 W인경우
        		for(int a=0;a<8;a++) {
        			for(int b=0;b<8;b++) {
        				if((a%2==0&&b%2==0)||(a%2==1&&b%2==1)) {
        					if(coordinates[i+a][j+b]=='W') {
        					}//W자리에W
        					else cnt2++;//W자리에 B
        				}
        				else//B자리
        					if(coordinates[i+a][j+b]=='B') {
        						
        					}//B자리에B
        					else cnt2++;//B자리에W
        				
        			}
        		}
        		
        		if(cnt1<mincnt) {
        			
        			mincnt=cnt1;
        		}
        		if(cnt2<mincnt) {
        			
        			mincnt=cnt2;
        		}
        	}
        }
        
        System.out.println(mincnt);
    }
}