
public class Member extends Person{
	private int membershipNumber;

	public int getMembershipNumber() {
		return membershipNumber;
	}

	public void setMembershipNumber(int membershipNumber) {
		this.membershipNumber = membershipNumber;
	}

	public Member() {
		super();
	}

	public Member(String sName, String fName, String lasName, int memNo) {
		super(sName, fName, lasName);
		// TODO Auto-generated constructor stub
		this.membershipNumber = memNo;
	}
	
	public String toString() {
		return super.toString()+" "+this.membershipNumber;
	}
	
	public void Show() {
		System.out.println(this.toString());
	}
}
