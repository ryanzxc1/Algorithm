import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;


class Member{
	int age;
	String name;
	
	public Member(int age, String name) {
		this.age=age;
		this.name=name;
	}
}


public class Main {
	
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N= Integer.parseInt(br.readLine());
		
		ArrayList<Member>[] membersByAge = new ArrayList[201];//배열 공간 201개 선언
 		for(int i=1;i<=200;i++) {
 			membersByAge[i] = new ArrayList<>();
 		}//각 칸에 ArrayList객체 생성하여 할당
		
 		for(int i=0;i<N;i++) {
 			StringTokenizer st = new StringTokenizer(br.readLine());
 			int age = Integer.parseInt(st.nextToken());
 			String name = st.nextToken();
 			membersByAge[age].add(new Member(age,name));
 		}
 		
 		for(int i=1;i<=200;i++) {
 			if(membersByAge[i]!=null) {
 				for(int j=0;j<membersByAge[i].size();j++) {
 					Member member = membersByAge[i].get(j);
 					System.out.println(member.age + " " + member.name);
 				}
 			}
 		}
 		
	}
	
}

/*
 * 예시: membersByAge[3] : [Member(3, "brandon"), Member(3, "jason"), Member(3, "ryan")]

membersByAge[5] : [Member(5, "charlie")]
 */