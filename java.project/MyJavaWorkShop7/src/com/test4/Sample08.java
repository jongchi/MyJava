package com.test4;
import java.util.ArrayList;

//class Database {
//	void open() { 
//		System.out.println("Database open");
//	}
//	
//}
//class Oracle extends Database {
//	void select_oracle() {
//		System.out.println("Oracle select");
//	}
//	void open() {
//		System.out.println("Oracle open");
//	}
//}
//class MySql extends Database {
//	void select_mysql() {
//		System.out.println("MySql select");
//	}
//	void open() {
//		System.out.println("MySql open");
//	}
//}
public class Sample08 {
	public static void main(String[] args) {
		Oracle oracle = new Oracle();
		oracle.open();
		oracle.select_oracle();
		Database database = oracle;
		database.open();
		Oracle oracle2 = new Oracle();
		Database database1 = oracle2;
		Database database2 = new Oracle();
		database.open();
		MySql mysql = new MySql();
		mysql.select_mysql();
		Database database3 = new MySql();
		openDb(new Oracle());
		openDb(new MySql());
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("ÀÌ¼ø½Å");
		al.add(new Oracle());
		Object o = al.get(2);
		Oracle o2 = (Oracle)o;
		o2.open();
	}
	static void openDb(Database db) {
		// Database db = new Oracle();
		// Database db2 = new MySql();
		db.open();
	}
}
