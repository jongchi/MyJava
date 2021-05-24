package com.test4;

class Database {
	void open() { 
		System.out.println("Database open");
	}
	
}
class Oracle extends Database {
	void select_oracle() {
		System.out.println("Oracle select");
	}
	void open() {
		System.out.println("Oracle open");
	}
}
class MySql extends Database {
	void select_mysql() {
		System.out.println("MySql select");
	}
	void open() {
		System.out.println("MySql open");
	}
}
class SqlServer extends Database {
	void select_sqlServer() {
		System.out.println("SqlServer select");
	}
	void open() {
		System.out.println("SqlServer open");
	}
}
public class Sample10 {
	static void openDb(Database db) {
		db.open();
	}
	static Database CreateDatabase(String dbName) {
		Database db = null;
		switch(dbName) {
		case "Oracle":
			db = new Oracle();
			break;
				
		case "MySql":
			db = new MySql();
			break;
		case "SqlServer":
			db = new SqlServer();
			break;
		}
		return db;
	}
	
	public static void main(String[] args) {
//		Database db = new Oracle();
//		db.open();
//		Database db2 = new MySql();
//		db2.open();
//		openDb(new Oracle());
//		openDb(new MySql());
		Database db3 = CreateDatabase("Oracle"); // 최종적으로는 이렇게 사용해야 재사용성이 높고 범용성이 높음
		openDb(db3);
		Database db4 = CreateDatabase("MySql");
		openDb(db4);
		Database db5 = CreateDatabase("SqlServer");
		openDb(db5);
	}
}

