package ch06;

public class Student {
	private String stuName;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	public int sum;
	public int average;
	public Student(String stuName, int koreanScore, int englishScore, 
			int mathScore) {
		this.stuName = stuName;
		this.koreanScore = koreanScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
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
	int getSum() {
		sum = koreanScore + englishScore + mathScore;

		return sum;
	}
	int getAverage() {
		average = (koreanScore + englishScore + mathScore)/3;
		return average;
	}
	void stuInfo() {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("국어 점수 : " + koreanScore);
		System.out.println("영어 점수 : " + englishScore);
		System.out.println("수학 점수 : " + mathScore);
		System.out.println("총 점수 : " + getSum());
		System.out.println("평균 점수 : " + getAverage());
		System.out.println();
	}

	public static void main(String[] args) {
		Student[] stuArr = new Student[10];
		stuArr[0] = new Student("홍길동",80,90,100);
		stuArr[1] = new Student("임꺽정",70,65,90);
		stuArr[2] = new Student("이순신",90,100,95);
		
		for(int i = 0; i < stuArr.length; i++) {
			stuArr[i].stuInfo();
		}
		

	}

}
