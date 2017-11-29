import java.util.ArrayList;
import java.util.HashMap;

public class Club {
	private int currentNumber = 0;
	//private  static Member[] member = new Member[5];
	private ArrayList<Member> members = new ArrayList<Member>();
	//private ArrayList<Facility> facilities = new ArrayList<Facility>();
	
	HashMap<String , Facility> hs = new HashMap<String, Facility>();

//	public static Member[] getMember() {
//		return member;
//	}
//
//	public static void setMember(Member[] member) {
//		Club.member = member;
//	}
//	
//	
//	//private static int Member_Increment_Value;
//	
//	public void addMember(Member m) {
//		currentNumber ++;
//		if(currentNumber <= 5) {
//			member[currentNumber-1] = m;
//			//System.out.println("testing");
//		}
//		else {
//			System.out.println("Full");
//		}
//	}
//	
//	public void removeMember (int memberNumber) {
//		if(memberNumber < 1 || memberNumber > 5) {
//			System.out.println("Not Vails");
//		}
//		else {
//			member[currentNumber-1] = null;
//		}
//	}
//	
//	public void showMember() {
//		for(int i = 0; i < member.length; i++) {
//			if(member[i]!=null)
//				System.out.println(member[i].getMembershipNumber());
//		}
//	}
		

	public Facility getFacility (String name) {		
		return hs.get(name);
	}
	
	public ArrayList<Member> getMembers() {
		return members;
	}

	public HashMap<String, Facility> getHs() {
		return hs;
	}

	public void setHs(HashMap<String, Facility> hs) {
		this.hs = hs;
	}

	public void setMembers(ArrayList<Member> members) {
		this.members = members;
	}
	
	public void addMember(Member m) {
		currentNumber ++;
		members.add((currentNumber-1), m);
	}
	
	public void addFacility(Facility f) {
		hs.put(f.getFacilityName(), f);
	}
	
	public void removeMember(int memNo) {
		currentNumber--;
		members.remove(memNo);
	}
	
	public void removeFacility(String fName) {
		hs.remove(fName);
	}
	
	public void showMember() {
		for(int i = 0; i < members.size(); i++) {
			if(members.get(i)!=null) {
				System.out.println(members.get(i));
			}
		}
	}
	
	public void showFacility() {
		System.out.println(hs.toString());
	}
}
