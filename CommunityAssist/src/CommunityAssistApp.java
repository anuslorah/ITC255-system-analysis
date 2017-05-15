
public class CommunityAssistApp {

	public static void main(String[] args) {

		Donation d = new Donation();
		Donor dd = new Donor();
		
		dd.setDonorID(001);
		dd.setFirstName("Mike");
		dd.setLastName("Bot");
		dd.setEmail("mike@bot.com");
		
		d.setDonationAmount(500);
		d.setDonationID(0001);
		d.setDate("5/11/2017");
		
		Donation d1 = new Donation();
		Donor dd1 = new Donor();
		
		d1.setDonationAmount(2500);
		dd1.setDonorID(002);
		d1.setDonationID(0002);
		d1.setDate("5/07/2017");
		
		Donation d2 = new Donation();
		Donor dd2 = new Donor();
		
		d2.setDonationAmount(50);
		dd2.setDonorID(003);
		d2.setDonationID(0003);
		d2.setDate("5/10/2017");
		
		//this would be significantly more efficient with toString
		
		System.out.println("Donation amount: $" + d.getDonationAmount() + "\n" 
				+ "DonorID: " + dd.getDonorID() + "\n"
				+ "Donor: " + dd.getFirstName() + " " + dd.getLastName() + "\n"
				+ "Email: " + dd.getEmail() + "\n"
				+ "DonationID: " + d.getDonationID() + "\n" 
				+ "Date: " + d.getDate()+ "\n");
		
		System.out.println("Donation amount: $" + d1.getDonationAmount() + "\n" 
				+ "DonorID: " + dd1.getDonorID() + "\n" 
				+ "DonationID: " + d1.getDonationID() + "\n" 
				+ "Date: " + d1.getDate()+ "\n");
		
		System.out.println("Donation amount: $" + d2.getDonationAmount() + "\n" 
				+ "DonorID: " + dd2.getDonorID() + "\n" 
				+ "DonationID: " + d2.getDonationID() + "\n" 
				+ "Date: " + d2.getDate());
	}

}
