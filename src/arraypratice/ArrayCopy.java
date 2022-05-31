package arraypratice;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
					//(복사할배영,첫위치,대상배열,붙여넣을 첫위치,복사할 요소 개수)
		for(int i:array2)
			System.out.println(i);
	}

}
