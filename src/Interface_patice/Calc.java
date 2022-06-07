package Interface_patice;

public interface Calc {
	double p1 =3.14;
	int error = -9999;
	//인터페이스에 선언한 변수는 컴파일 과정에서 자동으로 추상 매서드로 변환되므로
	//추상클래스 처럼 final을 사용할 필요가 없다.
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
