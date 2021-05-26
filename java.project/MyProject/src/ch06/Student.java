package ch06;

public class Student {

//	Student 클래스를 정의해봅시다.
//	①학생이름, 국어점수, 영어점수, 수학점수를 저장하는 변수를 정의 합니다.	

	private String Name;
	private int koreanScore;
	private int englishScore;
	private int mathScore;

	public Student(String Name, int koreanScore, int englishScore, 
			int mathScore) {
		this.Name = Name;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;

		
//		②변수는 캡슐화를 합니다. getter/setter 메소드를 정의합니다.	
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

//	③총점과 평균을 구해 결과를 반환하는 메소드를 정의합니다.
	
	int getSum() {
		return koreanScore + englishScore + mathScore;
	}
	int getAverage() {
		return  (koreanScore + englishScore + mathScore)/3;
	}
	void stuInfo() {
		System.out.println("학생 이름 : " + Name);
		System.out.println("국어 점수 : " + koreanScore);
		System.out.println("영어 점수 : " + englishScore);
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("총 점수 : " + getSum());
		System.out.println("평균 점수 : " + getAverage());
		System.out.println();
	}

	public static void main(String[] args) {

//		main()메소드에 아래 내용을 정의해봅시다.
//		①Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
//		②Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
//		③배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		
		Student[] stuArr = new Student[10];


		stuArr[0] = new Student("홍길동",80,90,100);
		stuArr[1] = new Student("임꺽정",70,65,90);
		stuArr[2] = new Student("이순신",90,100,95);
		try {
			for(int i = 0; i < stuArr.length; i++) {
				stuArr[i].stuInfo();
			}			
		} catch(NullPointerException e) {
			System.out.println("학생 정보를 추가해주세요.");
		} 
	} // main의 끝
}
