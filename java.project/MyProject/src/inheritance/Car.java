package inheritance;

public class Car {
	int gasolinegauge;
	Car(int gg){
		gasolinegauge = gg;
	}
}

class HybridCar extends Car {
	int electronicGauge;
	HybridCar(int gg, int eg){
		super(gg);
		electronicGauge = eg;
	}
	
	HybridCar(int gg){
		super(gg);
	}
}

class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	HybridWaterCar(int gg, int eg, int wg){
		super(gg, eg);
		waterGauge = wg;
	}
	
	HybridWaterCar(int gg){
		super(gg);
	}
	
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린 : " + gasolinegauge);
		System.out.println("잔여 전기 : " + electronicGauge);
		System.out.println("잔여 물 : " + waterGauge);
	}
}
