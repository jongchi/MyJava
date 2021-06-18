package dept;

public class Dept { 	
				// 사용자가 입력 데이터를 넣어서 사용 + DB

	 private int deptno; // 부서번호
	 private String dname; // 부서 이름

	 private String loc; // 부서의 위치

	 public Dept(int deptno, String dname, String loc) {
		 this.deptno = deptno;
		 this.dname = dname;
		 this.loc = loc;
	 }
	 
	 public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
}
