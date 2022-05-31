package Ndemention;

public class Array_Small_letter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c [][] = {{'a','b','c','d'},{'e','f','g','h'}};
		for(int i=0; i<c.length;i++) {
			for(int j=0;j<c[i].length;j++) {
				System.out.print(c[i][j]);
			}
			System.out.println("\t");
		}
	}

}
