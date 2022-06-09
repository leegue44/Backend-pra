package Object_pratice;
class Book{
	String name;
	int booknumber;
	public Book(String name,int booknumber) {
		this.booknumber=booknumber;
		this.name=name;
	}
	public String toString() {
		return name + ","+booknumber;
	}
	
}


public class ToString_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 =new Book("money",1001);
		
		System.out.println(book1);
	}

}
