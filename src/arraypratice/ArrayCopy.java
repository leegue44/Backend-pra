package arraypratice;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10,20,30,40,50};
		int[] array2 = {1,2,3,4,5};
		
		System.arraycopy(array1, 0, array2, 1, 4);
					//(�����ҹ迵,ù��ġ,���迭,�ٿ����� ù��ġ,������ ��� ����)
		for(int i:array2)
			System.out.println(i);
	}

}
