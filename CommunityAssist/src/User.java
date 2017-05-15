
public class User {
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String phoneNumber;
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	
		public void User (){
		userName = "";
		email = "";
		firstName = "";
		lastName = "";
		dateOfBirth = "";
		phoneNumber = "";
		streetAddress = "";
		city = "";
		state = "";
		zipcode = 0;
				
	}
	
	public void User(String userName, String email, String firstName, 
			String lastName, String dateOfBirth, String phoneNumber, 
			String streetAddress, String city, String state, int zipcode){
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public void viewGrantRepor(){
		
	}
	public void viewDonationReport(){
		
	}
	public void viewDonationTotals(){
		
	}
}
