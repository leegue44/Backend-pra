package Interface_patice;

public interface Calc {
	double p1 =3.14;
	int error = -9999;
	//�������̽��� ������ ������ ������ �������� �ڵ����� �߻� �ż���� ��ȯ�ǹǷ�
	//�߻�Ŭ���� ó�� final�� ����� �ʿ䰡 ����.
	int square(int num);
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int times(int num1,int num2);
	int divide(int num1,int num2);
	static int total(int [] arr) {
		int total =0;
		for(int i :arr)
			total+=i;
		return total;
	}
}
