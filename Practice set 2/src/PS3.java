import static org.junit.Assert.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AccountTest {

	public void test() throws InsufficientFundsException {
		Account test = new Account(1122, 20000.0, .045);
		
		 assertTrue("By withdrawing 2500, your balance is now 17500", test.withdraw(2500) ==  17500);
		 assertTrue("By depositing 3000, your balance is now 20500 ", test.deposit(3000) == 20500);
		 assertFalse("InsufficientFundsTest", test.withdraw(500000) == 479500);
		 
		 System.out.println("Your balance is:$ " + test.getBalance());
	     System.out.println ("Your monthly interest is:$ " + test.getAnnualInterestRate()/ 12);
	     System.out.println ("Your account was created on: " +  test.getDateCreated());
	}
}