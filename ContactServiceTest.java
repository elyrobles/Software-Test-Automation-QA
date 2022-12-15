//Module 3 Assignment by Elizabeth Robles 11/9/22

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import contactservice.Contact;
import contactservice.ContactService;

class ContactServiceTest {

	//All tests make sure the add, delete, and update requirements have been met in ContactService class using JUnit test
	@Test
	void testAddContact() {
		ContactService contactservice = new ContactService();
		Contact contact = new Contact("12345678", "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		assertTrue(contactservice.addContact(contact));
	}
	
	@Test
	void testDelelteContact() {
		ContactService contactservice = new ContactService();
		Contact contact = new Contact("12345678", "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		Contact contact2 = new Contact("12345679", "Mary", "Robles", "7144962867", "1801 Imperial, La Habra CA");
		Contact contact3 = new Contact("12345676", "David", "Robles", "7144962738", "1801 Imperial, La Habra CA");
		Contact contact4 = new Contact("12341234", "Vivian", "Robles", "7144997653", "1801 Imperial, La Habra CA");
		contactservice.addContact(contact);
		contactservice.addContact(contact2);
		contactservice.addContact(contact3);
		contactservice.addContact(contact4);
		assertTrue(contactservice.deleteContact("12345679"));
		assertTrue(contactservice.deleteContact("12341234"));
		assertFalse(contactservice.deleteContact("7145673498"));
		assertFalse(contactservice.deleteContact("1234"));
	}
	
	// Test the update methods.
	@Test
	void testUpdateContact(){
		ContactService contactservice = new ContactService();
		Contact contact = new Contact("12345678", "Elizabeth", "Robles", "7144961953", "1801 Imperial, La Habra CA");
		Contact contact2 = new Contact("12345679", "Mary", "Robles", "7144962867", "1801 Imperial, La Habra CA");
		Contact contact3 = new Contact("12345676", "David", "Robles", "7144962738", "1801 Imperial, La Habra CA");
		Contact contact4 = new Contact("12341234", "Vivian", "Robles", "7144997653", "1801 Imperial, La Habra CA");
		contactservice.addContact(contact);
		contactservice.addContact(contact2);
		contactservice.addContact(contact3);
		contactservice.addContact(contact4);
		assertTrue(contactservice.updateContactField("12345676", "DavidSil", "Tobles", "7144962738", "1801 Imperial, La Habra CA"));
		assertTrue(contactservice.updateContactField("12341234", "Vivy", "Guti", "5623456789", "1801 Imperial, La Habra CA"));
		assertFalse(contactservice.updateContactField("12345677", "DavidSil", "Tobles", "7144962738", "1801 Imperial, La Habra CA"));
		assertFalse(contactservice.updateContactField("0987", null, null, null, null));
	}
 
}
