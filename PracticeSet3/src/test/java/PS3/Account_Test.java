package PS3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.InsufficientFundsException;

public class Account_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InsufficientFundsException {
		Account a = new Account(1122,20000);
		a.setAnnualInterestRate(0.045);
		a.withdraw(2500);
		a.deposit(3000);
		System.out.println("Balance: " + a.getBalance());
		System.out.println("Monthly Interest Rate: " + a.getMonthlyInterestRate());
		System.out.println("Date of Creatation: " + a.getDateCreated());
		
		try{
			a.withdraw(40000);
		}catch(InsufficientFundsException e){
			System.out.println("Insufficient Funds.  You are short by: " + e.getAmount());
		}
		
	}

}
