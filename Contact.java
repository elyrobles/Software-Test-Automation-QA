//Module 3 Assignment by Elizabeth Robles 11/9/22

package contactservice;

public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone; 
	private String address;
	
	public Contact(String contactID, String firstN, String lastN, String phoneN, String addressN) {
		
		//checks to see if contactID, first & last name, phone and address all meet the requirements of no null characters and valid length
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		
		if(firstN == null || firstN.length()>10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		
		if(lastN == null || lastN.length()>10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		
		if(phoneN == null || phoneN.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		
		if(addressN == null || addressN.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		
		this.contactId = contactID;
		this.firstName = firstN;
		this.lastName = lastN;
		this.phone = phoneN;
		this.address = addressN;
	}
	//Getter
	public String getContactId() {
		return this.contactId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	//Setter
	public void setContactID(String contactID) {
		this.contactId = contactID;
	}
	
	public void setFirstName(String firstN) {
		this.firstName = firstN;
	}
	
	public void setLastName(String lastN) {
		this.lastName = lastN;
	}
	
	public void setPhone(String phoneN) {
		this.phone = phoneN;
	}
	
	public void setAddress(String addressN) {
		this.address = addressN;
	}
}
