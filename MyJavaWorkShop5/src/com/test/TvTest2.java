package com.test;
class Tv {
	String color;		//����
	boolean power;		//�������� ( on / off )
	int channel;		//ä��

	// Tv�� ��� (�޼���)
	void power() { power = !power; } // TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; } // TV�� ä���� ���̴� ����� �ϴ� �޼���
	void channelDown() { --channel;} // TV�� ä���� ���ߴ� ����� �ϴ� �޼���
}


public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();	// Tv t1; t1 = new Tv();�� �� �������� ����
		Tv t2 = new Tv();
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�. ");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�. ");
		
		t2 = t1;		//t1�� �����ϰ� �ִ� ��(�ּ�)�� t2�� �����Ѵ�.
		t1.channel = 7;
		System.out.println("t1�� channel���� 7�� �����Ͽ����ϴ�.");
		
		System.out.println("t1�� channel���� "+ t1.channel + "�Դϴ�. ");
		System.out.println("t2�� channel���� "+ t2.channel + "�Դϴ�. ");

	}

}
