package arraypratice;

import A_rray_list.Book;

public class Objectcopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookarry1 =new Book[3];
		Book[] bookarry2 =new Book[3];
		
		bookarry1[0]=new Book("태백","조정래");
		bookarry1[1]=new Book("marry","jorn");
		bookarry1[2]=new Book("magig","king");
		bookarry2[0]=new Book("ga","hahah");
		System.arraycopy(bookarry1, 0, bookarry2, 1, 2);
		for(Book i:bookarry2)
			i.showBookInfo();
	}

}
