import java.util.Scanner;

public class Sample08_1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		##################################
//		# 1. µ¡¼À
//		# 2. »¬¼À
//		# 3. °ö¼À
//		# 4. ³ª´°¼À
//		# 5. Á¾·á
//		##################################
//		# ¸Å´º ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. :  
//		1 => µ¡¼ÀÀÔ´Ï´Ù.
		System.out.println("##################################");
		System.out.println("# 1. µ¡¼À");
		System.out.println("# 2. »¬¼À");
		System.out.println("# 3. °ö¼À");
		System.out.println("# 4. ³ª´°¼À");
		System.out.println("# 5. Á¾·á");
		System.out.println("##################################");
		System.out.println("¸Ş´º ¹øÈ£¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä. : ");
		String input = scanner.nextLine();
		char num = input.charAt(0);
		switch (num) {
			case '1' :
				System.out.println("µ¡¼ÀÀÔ´Ï´Ù.");
				break;
			case '2' :
				System.out.println("»¬¼ÀÀÔ´Ï´Ù.");
				break;
			case '3' :
				System.out.println("°ö¼ÀÀÔ´Ï´Ù.");
				break;
			case '4' : 
				System.out.println("³ª´°¼ÀÀÔ´Ï´Ù.");
				break;
			case '5' : 
				System.out.println("Á¾·áÇÏ°Ú½À´Ï´Ù.");
				break;
		}
	}

}
