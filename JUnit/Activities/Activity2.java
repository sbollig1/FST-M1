import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.*;


public class Activity2 {
	
	@Test
	void notEnoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(9);

	    // Assertion for exception
	    assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10));
	}
	
	@Test
	void enoughFunds() {
	    // Create an object for BankAccount class
	    BankAccount account = new BankAccount(100);

	    // Assertion for no exceptions
	    assertDoesNotThrow(() -> account.withdraw(100));
	}

}
