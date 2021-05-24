package com.test4;
abstract class Database {
	public void open() { System.out.println("Database open"); }
	abstract void select();
}

class Oracle2 extends Database {
	public void select() { System.out.println("Oracle open"); }
}
class MySql2 extends Database {
	public void select() {System.out.println("MySql open");}
}

class DbManager2 {
	Database db;
	DbManager2(Database db){
		this.db = db;
	}
	public void opening() {
		db.open();
	}
	public void selecting() {
		db.select();
	}
}
public class Sample06 {
	public static void main(String[] args) {
		Database db = new Oracle2();
		db.open();
		db.select();
		DbManager2 db2 = new DbManager2(new MySql2());
		db2.opening();
		db2.selecting();

	}

}
