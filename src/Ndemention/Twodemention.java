package Ndemention;

public class Twodemention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]);	
			System.out.print(" ");
			}
			System.out.println("\t");
		}
	}

}
