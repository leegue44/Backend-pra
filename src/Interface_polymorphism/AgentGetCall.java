package Interface_polymorphism;

public class AgentGetCall implements Scheduler{
	public void getNextCall() {
		System.out.println("������ ���� ��ȭ ��û");
	}
	public void sendCallToAgent() {
		System.out.println("������ ��ȭ ����� ���� �����ϴ�.");
	}

}
