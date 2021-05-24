package com.test3;
interface IDatabase{
	public void open();
	
}
interface IQuery extends IDatabase {
	public void select();
}
class Oracle implements IDatabase, IQuery {
	public void open() {
		System.out.println("Oracle open");
	}
	public void select() {
		System.out.println("Oracle Query");
	}
}
class MySql implements IDatabase {
	public void open() {
		System.out.println("MySql open");
	}
}

public class Sample03 {
	static void openDb(IDatabase db) {
		db.open();
	}
	public static void main(String[] args) {
		Oracle db = new Oracle();
		db.open();
		IDatabase db2 = new Oracle();
		db2.open();
		IDatabase db3 = new MySql();
		db3.open();
		
	}
}
