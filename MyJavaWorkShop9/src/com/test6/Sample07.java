package com.test6;
interface IDatabase {
	public void open();
}

abstract class Database implements IDatabase {
	public void open() {
		System.out.println("Database open");	
	}
	abstract void select();
}

class Oracle extends Database {
	public void select() {
		System.out.println("Oracle open");
	}
}

public class Sample07 {
	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		Database db2 = new Oracle();
		db2.open();
		db2.select();
		Database db3 = (Oracle)db;
		db3.select();

	}

}
