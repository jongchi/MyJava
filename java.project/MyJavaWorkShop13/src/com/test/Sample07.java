package com.test;

interface IDatabase<T> {
	void open(T db);
}

class Database<T> implements IDatabase<T>{
	T db;
	public void open(T db) {
		this.db = db;
		System.out.println(db);
	}
}
class Oracle {}

public class Sample07 {
	public static void main(String[] args) {
		IDatabase<Oracle> oracle = new Database<Oracle>();
		oracle.open(new Oracle());

	}

}
