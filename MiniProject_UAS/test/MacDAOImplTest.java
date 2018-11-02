import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.cg.project.dao.MacDAO;
import com.cg.project.dao.MacDAOImpl;
import com.cg.project.dto.Applicant;
import com.cg.project.exception.UASException;

public class MacDAOImplTest {
	
	
private MacDAO macRef;
	
	@Before
	public void setup(){
		System.out.println("DAO instantiated");
		macRef = new MacDAOImpl();
	}
	
	@After
	public void tearDown(){
		System.out.println("DAO cleaned");
		macRef = null;
	}
	
	/*
	@Test
	public void testcreateapplicant() throws UASException{
		
	Applicant appl = new Applicant( "",dateofbirth,highestqualification,marksobtained,goals,email,scheduledprogramid,status,dateofinterview));
		boolean appl1 = macRef.createapplicant(appl);
		

		Assert.assertFalse(appl1);

	}
	*/
	
	@Test
	public void testretrieveapplicants(String id)
	{
		//change return type of function to boolean
	}

}
