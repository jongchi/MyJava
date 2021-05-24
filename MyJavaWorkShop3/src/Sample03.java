
public class Sample03 {

	 public static void main(String[] args) {
//		int a = 0;
//		a++; // a = a + 1
//		System.out.println(a);
//		int b = 0;
//		int c = b++;
//		System.out.println(c); // ++이 뒤에 붙어있을 경우는 호출했을 때 1이 증가하는것.
//		System.out.println(b);
//		
//		int d = 0;
//		++d;
//		System.out.println(d);
//		
//		int e = 0;
//		int f = ++e;
//		System.out.println(e); // ++이 앞에 붙어있을 경우는 일단 무조건 1이 증가함.
//		System.out.println(f);
//		
//		int h = 10;
//		System.out.println(h++);
//		System.out.println(h);
//		System.out.println(++h);
//		System.out.println(h);
//		
//		int h1 = 10;
//		System.out.println(h1--);
//		System.out.println(h1);
//		System.out.println(--h1);
//		
//		int i = 10;
//		int j = 10;
//		
//		System.out.println(i++ + ++i);
//		System.out.println(j++ + j++);
		
		int a = 10;
		int b = -10;
		
		System.out.println(~a);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(~a));
		boolean c = true;
		boolean d = false;
		System.out.println(!c);
		System.out.println(!d);
		
		int e = 10;
		int f = 3;
		System.out.println(e % f);
		
		int g = 100;
		int h = 200;
		System.out.println(g == h);
		System.out.println(g != h);
		System.out.println(g < h);
		System.out.println(g > h);
		System.out.println(g >= h);
		System.out.println(g <= h);
		boolean i = g == h;
		System.out.println(i);
		// and (&&), or (||)
		
		boolean j = (g == h) && (g != h);
		// false and true
		System.out.println(j);
		boolean k = (g == h) || (g != h);
		// false and true
		System.out.println(k);
		
		boolean l = ((g== h)&&(g !=h))
					||((g == h)||(g !=h));
		System.out.println(l);
	 }
}
