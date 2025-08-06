
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1= new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        
        HashSet<String> stringN=new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        
        
        for(int i=0;i<N;i++) {
        		stringN.add(br.readLine());
        }
        
    	for(int i=0;i<M;i++) {
    		String name= br.readLine();
    		if(stringN.contains(name)) {
    			list.add(name);
    		}
    	
    	}
        
       
        Collections.sort(list);
       
        
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        br.close();
    }
}

//아래는 for문으로 0번부터 쭉 찾는 코드
//해시셋 쓰면 해시값 이용해서 원하는 곳으로 바로갈 수 있음
//하지만 해시셋 쓰면 해시값으로 인한 효율적 탐색을 위해 해시테이블 구조 전체가 더 많은 메모리 필요
//이게 공간-시간트레이드오프

/*
 * 
 * 시간초과 코드
  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1= new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st1.nextToken());
        int M = Integer.parseInt(st1.nextToken());
        int cnt=0;
        
        
        String[] stringN = new String[N];
        String[] stringM = new String[M];
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<N;i++) {
        	stringN[i]=br.readLine();
        	
        	}
        
    	for(int i=0;i<M;i++) {
    		stringM[i]=br.readLine();
    	
    	}
        
        for(int i=0;i<N;i++) {
        	for(int j=0;j<M;j++) {
        		if(stringN[i].equals(stringM[j])) {
        			list.add(stringM[j]);
        			cnt++;
        		}
        	}
        }
        Collections.sort(list);
       
        
        System.out.println(cnt);
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
        br.close();
    }
}

 */
