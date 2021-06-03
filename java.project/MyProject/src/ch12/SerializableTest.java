package ch12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;


public class SerializableTest {

	public static void main(String[] args) {
		// ①축구선수 정보 인스턴스를 List<E>에 저장하는 프로그램을 만들어 봅시다.

		
		// ②이 인스턴스 들을 파일로 저장하는 기능을 만들어 봅시다.
		
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FootballPlayer.ser"));
			
			ArrayList<FootballPlayer> list = new ArrayList<>();
			
			list.add(new FootballPlayer("Son1", 7, "Tot", 27));
			list.add(new FootballPlayer("Park1", 7, "Man", 37));
			list.add(new FootballPlayer("Son1", 9, "Tot", 27));
			list.add(new FootballPlayer("Son2", 20, "Tot", 37));
			list.add(new FootballPlayer("Park2", 20, "Man", 31));
			list.add(new FootballPlayer("Park2", 21, "Man", 31));		
			out.writeObject(list);
			
			out.close();
			
			System.out.println("인스턴스 저장 완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ③저장된 파일을 객체로 만드는 기능을 만들어봅시다.
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("FootballPlayer.ser"));
			
			ArrayList<FootballPlayer> list2 = (ArrayList<FootballPlayer>)in.readObject();
			Iterator itr = list2.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
