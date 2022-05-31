package A_rray_list;
import java.util.ArrayList;


public class A_rrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> library =new ArrayList<Book>();
		library.add(new Book("hi","hihi"));
		library.add(new Book("hii","hiihii"));
		library.add(new Book("hhi","hhihhi"));
		library.add(new Book("hhi","hhiihhhi"));
		for(Book i:library) {//향상된 for문 사용시
			i.showBookInfo();
		}
		for(int i =0; i<library.size();i++) {
			Book book =library.get(i);
			book.showBookInfo();
		}
	}

}
