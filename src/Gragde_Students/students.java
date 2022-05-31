package Gragde_Students;

import java.util.ArrayList;

public class students {
	private int stuid;
	private String studentname;
	ArrayList<subject> subjectlist;
	
	public students(String studentname,int stuid) {
		this.studentname=studentname;
		this.stuid=stuid;
		subjectlist =new ArrayList<subject>();
	}
	public void addsubject(String name,int score) {
		
		subject sub =new subject();
		sub.setpoint(score);
		sub.setname(name);
		subjectlist.add(sub);
	}
	public void showstudent() {
		for(subject i:subjectlist) {
			System.out.print(studentname+i.getsub()+i.getpoint());
			System.out.println("\t");
		}
	}
	
}
