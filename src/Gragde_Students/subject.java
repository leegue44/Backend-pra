package Gragde_Students;

public class subject {
	private String subjectname;
	private int grade;
	
	public void subject(String subjectname,int grade) {
		this.grade=grade;
		this.subjectname=subjectname;
	}
	public int getpoint() {
		return grade;
	}
	public void setpoint(int grade) {
		this.grade=grade;
	}
	public void setname(String name) {
		this.subjectname=name;
	}
	public String getsub() {
		return subjectname;
	}
	public void showsubject() {
		System.out.println(subjectname+" "+grade);
	}
}
