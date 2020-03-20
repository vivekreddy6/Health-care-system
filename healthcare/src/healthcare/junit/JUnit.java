package healthcare.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import healthcare.dao.AdminDao;
import healthcare.dao.AdminDaoImpl;
import healthcare.dto.Diagnostic;

public class JUnit {
	AdminDao dao = null;
	@Before
	public void setUp()
	{
		dao = new AdminDaoImpl();
	}
	@After
	public void tearDown()
	{
		dao = null;
	}
	
	@Test
	public void testAddCenter() 
	{
		AdminDao dao = new AdminDaoImpl();
		Diagnostic diag = new Diagnostic(123,"Health",123.0,"1-09",04023456);
		int rows = dao.addDiagnosticCenter(diag);
		Assert.assertEquals(rows,1);
	}
	public void testNegativeAddCenter() 
	{
		AdminDao dao = new AdminDaoImpl();
		Diagnostic diag = new Diagnostic();
		int rows = dao.addDiagnosticCenter(diag);
		Assert.assertNotEquals(rows,2);
	}
	public void testDeleteCenter() 
	{
		AdminDao dao = new AdminDaoImpl();
		Diagnostic diag = new Diagnostic(2,"vijaya",12,"chennai",55965438); 
		int rows= dao.deleteDiagnosticCenter(2);
		Assert.assertEquals(rows,1);
	}
	
}
