//Module 3 Assignment by Elizabeth Robles 11/9/22

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactservice.Contact;
 
class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("12345678", "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		assertTrue(contact.getContactId().equals("12345678"));
		assertTrue(contact.getFirstName().equals("Elizabeth"));
		assertTrue(contact.getLastName().equals("Robles")); 
		assertTrue(contact.getPhone().equals("7144961953"));
		assertTrue(contact.getAddress().equals("1801 Imperial, La Habra CA"));
	}
	
	 
	//All tests make sure that the contact ID, first and last name, phone number, and address meet the requirements via a JUnit Test
	@Test
	void testContactContactIdToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> { 
			new Contact("12345678999", "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactContactIdIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact(null, "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactFirstNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabethhh", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactFirstNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", null, "Robles", "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactLastNameToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", "Roblessssss", "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactLastNameIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", null, "7144961953", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactPhoneToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", "Robles", "71449619533", "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactPhoneIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", "Robles", null, "1801 Imperial, La Habra CA");
		});
	}
	
	@Test
	void testContactAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", "Robles", "7144961953", "1801 Imperial Hwy, La Habra CA 90631");
		});
	}
	
	@Test
	void testContactAddressIsNull() {
		Assertions.assertThrows(IllegalArgumentException.class, ()-> {
			new Contact("12345678", "Elizabeth", "Robles", "7144961953", null);
		});
	}

}
