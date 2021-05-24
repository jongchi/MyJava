package com.test6;
class Product {
	int price;		// ��ǰ�� ����
	int bonuspoint;	// ��ǰ ���� �� �����ϴ� ���ʽ� ����

	Product(int price){
		this.price = price;
		bonuspoint = (int)(price/10.0);
	}
	Product(){} 	//�⺻ ������
}

class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() { return "Tv";}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() { return "Computer";}
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() { return "Audio";}
}

class Buyer {								// ��, ������ ��� ���
	int money = 1000;						// ���� �ݾ�
	int bonuspoint = 0;						// ���ʽ� ����
	Product[] item = new Product[10];		// ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0;								// Product �迭�� ���� ī����
	
	void buy(Product p) {
		if(money <p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;					// ���� ������ ������ ��ǰ�� ������ ����.
		bonuspoint += p.bonuspoint;			// ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		item[i++] = p;						// ��ǰ�� Product[] item�� �����Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
	}
	
	void summary() {						// ������ ��ǰ�� ���� ������ ����ؼ� �����ش�.
		int sum = 0;						// ������ ��ǰ�� ���� �����հ�
		int point = 0;
		String itemList = ""; 				// ������ ��ǰ���
		// �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
		for(int i = 0; i<item.length;i++) {
			if(item[i]==null) { break;}
			sum += item[i].price;
			point += item[i].bonuspoint;
			itemList += (i==0) ? "" + item[i] : "," + item[i];
		}
		
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("���� ���ʽ� ����Ʈ��  " + point + "�� �Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("���� �ܾ��� "+ money + "�Դϴ�.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
