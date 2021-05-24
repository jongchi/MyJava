package com.test3;

import java.sql.*;
import java.util.*;
class Emp {
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	private String empName;
	private String empAddress;
	public Emp(int empId, String empName, String empAddress) {
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	public Emp() {
		
	}
}

public class SampleJdbc {
	public static void main(String[] args) {
		ArrayList<Emp> emps = null;
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testdb","test","1234");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			emps = new ArrayList<Emp>();
			while(rs.next())  
//			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
					emps.add(new Emp(rs.getInt(1),
							rs.getString(2),
							rs.getString(3)));
			con.close(); 	
			}catch(Exception e){ System.out.println(e);
		}
		for(Emp e : emps) {
			System.out.println(e.getEmpId() + ", "+
					e.getEmpName() +", "
					+ e.getEmpAddress());
		}
	}  
}	


