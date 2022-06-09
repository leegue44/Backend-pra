package Object_pratice;
class MyDate{
	int day;
	int month;
	int year;
	public MyDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate md =(MyDate)obj;
					
		if(this.day == md.day) 
			return true;
		else return false;
		}
		return false;
	}
	public int hashCode() {
		return day;
	}
}
public class equals_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date1 = new MyDate(9,18,2004);
		MyDate date2 = new MyDate(9,18,2004);
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}

}
