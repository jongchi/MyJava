package inheritance.ex;

public class Buyer {

	int money;
	int bonusPoint;
	
	public Buyer() {
		super();
		this.money = 10000;
		this.bonusPoint = 0;
	}
	
	// 제품을 구매
	void buy(Product p) {
		// 보유 금액을 확인하고 구매여부 체크	
		if(this.money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return; // 메소드의 종료, 값을 반환
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p);
	}		
}
