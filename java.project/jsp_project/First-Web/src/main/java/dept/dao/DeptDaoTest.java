package dept.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.sql.Connection;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dept.domain.Dept;
import jdbc.util.ConnectionProvider;

public class DeptDaoTest {
	
	Connection conn = null;
	DeptDao dao = null;
	Dept insertDept = new Dept(11, "개발", "서울");
	Dept deleteDept = new Dept(12, "마케팅", "부산");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}
	
	@Before
	public void setUp() throws Exception {
		conn = ConnectionProvider.getConnection();
		dao = DeptDao.getInstance();
	}

	@Test
	public void testGetDeptList() {
		assertNotNull("getDeptList method test :", dao.getDeptList(conn));
	}

	@Test
	public void testInsertDept() {
		assertEquals("insertDept method test : ", 1, dao.insertDept(conn, insertDept));
		assertEquals("insertDept method test : ", 1, dao.insertDept(conn, deleteDept));
	}

	@Test
	public void testSelectByDeptno() {
		assertSame("selectByDeptno method test :", insertDept.getDeptno(), (dao.selectByDeptno(conn, insertDept.getDeptno()).getDeptno()));
	}

	
	 @Test public void testDeleteDept() { 
		 assertEquals("deleteDept method test :",1, dao.deleteDept(conn, deleteDept.getDeptno())); 
	}
	
	 
	@Test
	public void testUpdateDept() {
		insertDept = new Dept(13,"영업", "인천");
		assertEquals("updateDept method test : ", 1 ,dao.updateDept(conn, insertDept));
	}


}
