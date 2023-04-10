package method_overriding;
class sports{
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMemberes() {
		System.out.println("Each team has n players in "+getName());
	}
}
class Soccer extends sports{
	String getName() {
		return "Soccer class";
	}
	void getNumberOfTeamMemberes() {
		System.out.println("Each team has 11 players in "+getName());
}}
public class Overriding_Eg1 {
	public static void main(String[] args) {
		sports s1=new sports();
		Soccer s2=new Soccer();
		System.out.println(s1.getName());
		s1.getNumberOfTeamMemberes();
		System.out.println(s2.getName());
		s2.getNumberOfTeamMemberes();
	}

}
