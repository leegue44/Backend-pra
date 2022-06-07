package Interface_polymorphism;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
}
