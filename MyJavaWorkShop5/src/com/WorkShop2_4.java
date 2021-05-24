package com;

public class WorkShop2_4 {

	public static void main(String[] args) {
		String[][] students = {
				{"A","B","A","C","C","D","E","F","A","D"},
				{"D","B","A","B","C","A","E","F","A","D"},
				{"E","D","D","A","C","B","E","E","A","D"},
				{"C","B","A","E","D","D","E","F","A","D"},
				{"A","B","D","C","C","D","E","E","A","D"}
				
		};
		
		String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
//		System.out.println(students[1].length);
		
		for(int i = 0; i < students.length; i++) {
			int count = 0;
			for(int j = 0; j < students[i].length; j++) {
			if(students[i][j] == answer[j]) {
				count++;
				}
			}
			System.out.printf("The Student[%d]'s Score is %d%n", i+1, count);
		}
	}

}
