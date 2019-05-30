package polymorphism;
public class MainSports{
	public static void main(String args[]) {
		Sports sp=new Sports();
		System.out.println(sp.getName());
		sp.getNumberOfTeamMembers();
		Soccer sc=new Soccer();
		System.out.println(sc.getName());
		sc.getNumberOfTeamMembers(11);
		}
	}

