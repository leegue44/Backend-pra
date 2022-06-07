package Interface_patice;

public abstract class Calculator implements Calc {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int substract(int num1,int num2) {
		return num1 - num2;
	}
}
