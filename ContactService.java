//Module 3 Assignment by Elizabeth Robles 11/9/22

package contactservice;

import java.util.ArrayList;

public class ContactService {
	private ArrayList<Contact> contactList; 
	
	public ContactService() {
		contactList = new ArrayList<>();
	}
	
	//add contact
	public boolean addContact(Contact contacts) { 
		boolean contactExists = false;
		for (Contact contactInList:contactList) {
			if(contactInList.equals(contacts)) {
				contactExists = true;
			}
		}
		if (!contactExists) {
			contactList.add(contacts);
			return true;
		}
		else {
			return false; 
		}
	}
	
	//delete contact
	public boolean deleteContact(String contactId) {
		for(Contact contactInList:contactList) {
			if(contactInList.getContactId().equals(contactId)) {
				contactList.remove(contactInList);
				return true;
			}
		}
		return false;
	}
	
	//update contact fields
	public boolean updateContactField(String contactId, String firstName, String lastName, String phone, String address) {
		for (Contact contactInList:contactList) {
			if (contactInList.getContactId().equals(contactId)) {
				if(!firstName.equals(null) && !(firstName.length()>10)) {
					contactInList.setFirstName(firstName);
				}
				if(!lastName.equals(null) && !(lastName.length()>10)) {
					contactInList.setLastName(lastName);
				}
				if(!phone.equals(null) && !(phone.length()>10)) {
					contactInList.setPhone(phone);
				}
				if(!address.equals(null) && !(address.length()>30)) {
					contactInList.setAddress(address);
				}
				return true;
			}
		}

		return false;
	}
	

}
