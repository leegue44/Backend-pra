package Interface_polymorphism;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�");
	}
}
