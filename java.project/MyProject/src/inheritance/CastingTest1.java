package inheritance;

public class CastingTest1 {
	public static void main(String[] args) {
		Car1 car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		fe.water();
		car = fe; // car=(Car1)fe; 에서 형변환이 생략된 형태
		// car.water(); // 에러! Crar1타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine) car;
		fe2.water();

	}
}
