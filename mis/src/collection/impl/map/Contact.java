/*
 * Contact generic to use in hash map
 */
package collection.impl.map;

public class Contact {
	private String firstName;
	private String lastName;
	private String companyName;
	private double phoneNumber;
	
	public Contact(String firstName, String lastName, String companyName, double phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", companyName=" + companyName
				+ ", phoneNumber=" + phoneNumber + "]";
	}
}
