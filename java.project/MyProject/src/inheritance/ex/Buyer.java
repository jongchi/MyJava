package inheritance.ex;

public class Buyer {

	int money;
	int bonusPoint;
	Product[] item;
	int cnt;
	
	public Buyer() {
		super();
		this.money = 10000;
		this.bonusPoint = 0;
		this.item = new Product[10];
		this.cnt = 0; // 구매한 제품의 개수 -> 배열의 입력 index 값 2개의 역할을 함.
		
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
		
		// 구매내역에 제품을 추가
		item[cnt++] = p;
		
		System.out.println(p + "구매");
	}
	
	void summary() {
		// 구매 상품 리스트, 구매금액의 총합 출력
		int sum = 0; // 구매 총액
		int bonusPoint = 0;
		String itemList = "";
		
		// 배열을 반복 문을 이용해서 구매 내역을 완성
		for(int i=0;i<cnt;i++) {
			// 금액의 합
			sum += item[i].price;
			// 적립될 보너스 포인트
			bonusPoint += item[i].bonusPoint;
			// 구매 상품 이름
			if(i<cnt-1) {
				itemList += item[i]+ ", ";	
			} else {
				itemList += item[i];
			}
			
		}
		System.out.println("구매하신 제품은 " + itemList + "입니다.");
		System.out.println("구매하신 제품의 총 금액은 " + sum + "입니다.");
		System.out.println("구매하신 제품의 적립 포인트는 " + bonusPoint + "점 입니다.");
		
	}
}
