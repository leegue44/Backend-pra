package Interface_polymorphism;

import java.io.IOException;

public class SchdulerTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int ch = System.in.read();
		Scheduler s =null;
		
		if(ch=='R'||ch=='r') {
			s = new RoundRobin();
		}
		else if(ch=='L'||ch=='l') {
			s= new LeastJob();
		}
		else if(ch=='P'||ch=='p') {
			s= new PriorityAllocation();
		}
		else if(ch=='A'||ch=='a') {
			s=new AgentGetCall();
		}
		else {
			System.out.println("지원이 안되는 기능입니다");
			return;
		}
		s.getNextCall();
		s.sendCallToAgent();
		s.description();
	}

}
