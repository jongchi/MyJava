class MyTest {
	public int c;
	public String d;
}
public class Sample01 {

	public static void main(String[] args) {
//		int a = 10;
//		int b = 100;
//		String e = null;
//		System.out.println(a);
//		System.out.println(b);
//		MyTest t = new MyTest();
//		System.out.println(t.c);
//		System.out.println(t.d);
//		System.out.println(e);
		byte a10 = Byte.MAX_VALUE;
		System.out.println(a10);
		int a11 = Integer.MAX_VALUE;
		System.out.println(a11);
		int a12 = a10;
		System.out.println(a12);
		
		byte a13 = (byte)a11; // type cast : 형 변환 바이트를 초과하는 값을 날림.
		System.out.println(a13);
		int a14 = 100;
		byte a15 = (byte)a14;
		System.out.println(a15);
		
	}

}
