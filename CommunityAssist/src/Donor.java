
public class Donor extends User{
	private int donorID;
	
	public Donor(){
		super();
	}
	
	public int donate(){
		return donorID;
	}
	
	public int getDonorID() {
		return donorID;
	}

	public void setDonorID(int donorID) {
		this.donorID = donorID;
	}

	
}
