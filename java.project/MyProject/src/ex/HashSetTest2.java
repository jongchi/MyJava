package ex;

import java.util.*;

public class HashSetTest2 {
	public static void main(String[] args) {
		
		// hashSet 저장 공강 생성 : 
		// 인스턴스 저장, 
		// 중복 저장을 허용하지 않는다. 
		// 저장 순서를 저장하지 않는다.
		
		Set<SimpleNumber> hashSet = new HashSet<>();
		
		// 데이터 저장
		hashSet.add(new SimpleNumber(10));
		hashSet.add(new SimpleNumber(20));
		hashSet.add(new SimpleNumber(20));
		
		// 데이터의 일괄 처리
		// Iterator<String> itr = hashSet.iterator();
		Iterator<SimpleNumber> itr = hashSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

class SimpleNumber{
	
	int num;
	
	SimpleNumber(int num){
		this.num = num;
	}
	
	public String toString() {
		return String.valueOf(num);
	}
}