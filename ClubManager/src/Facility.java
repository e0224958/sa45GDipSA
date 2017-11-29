
public class Facility {
	private String facilityName;
	private String shortDescription;
	
	public Facility(String facName, String Des) {
		this.facilityName = facName;
		this.shortDescription = Des;
	}
	
	public Facility(String faciltName) {
		this.facilityName = faciltName;
	}

	public String getFacilityName() {
		return facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public void Show() {
		if(shortDescription != null)
		System.out.println("The room is "+facilityName+" "+shortDescription);
		else
		System.out.println("The room is "+facilityName);
	}
}
