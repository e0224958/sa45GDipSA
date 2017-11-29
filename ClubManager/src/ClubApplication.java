public class ClubApplication {
	public static void main(String[] args) {
		//System.out.println("hello");
		Member P1 = new Member("Han","Su","Yin",11112222);
//		P1.setSurname("Tang");
//		P1.setFirstName("Ah");
//		P1.setLastName("Beng");
		
		Member P2 = new Member("Wang","En",null,11223344);
//		P2.setSurname("Stan");
//		P2.setFirstName("Lurel");
		//P1.Show();
		//P2.Show();
		//System.out.println(P1.toString()); 
		//System.out.println(P2.toString());
		Member P3 = new Member("Thu","Zar",null,33334444);
		Member P4 = new Member("Wang", "En", "Hui", 44441998);
//		Facility F1 = new Facility("Conference Room.","This is 30 feet round room. The room has wide space too.");
//		F1.Show();
//		Facility F2 = new Facility("Workshop Room.");
//		F2.Show();
		
		Club c = new Club();
		c.addMember(P1);
		c.addMember(P2);
		c.addMember(P3);
		c.addMember(P4);
		c.showMember();
	}
}
