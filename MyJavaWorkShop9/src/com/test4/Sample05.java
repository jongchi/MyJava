package com.test4;
interface IDatabase {
	public void open();
}
class Oracle implements IDatabase {
	public void open(){ System.out.println("Oracle open");}
}
class MySql implements IDatabase {
	public void open() { System.out.println("MySql open");}
}
class SqlServer implements IDatabase {
	public void open() { System.out.println("SqlServer");}
}
class DbManager {
	IDatabase db;
	public DbManager(IDatabase db) { // IDatabase db = new Oracle();
		this.db = db;
	}
	public void run() {
		db.open();
	}
}
public class Sample05 {
	public static void main(String[] args) {
		IDatabase db = new Oracle();
		db.open();
		DbManager db1 = new DbManager(new MySql());
		db1.run();
		DbManager db2 = new DbManager(new SqlServer());
		db2.run();
	}

}
