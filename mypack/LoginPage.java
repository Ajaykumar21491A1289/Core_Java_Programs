package mypack;

public class LoginPage {
	public void userLogin(String uname, String pass) {
		System.out.println("User name " + uname);
		System.out.println("Password"+pass);
		System.out.println();
	}
	public void userLogin(String uname, String pass ,String cache) {
		System.out.println("User name " + uname);
		System.out.println("Password"+pass);
		System.out.println("Capche is "+cache);
		System.out.println();
	}
	public void userLogin(int mn,String pass) {
		System.out.println("Mobile Number " + mn);
		System.out.println("Password"+pass);
		System.out.println();
	}

	public static void main(String[] args) {
		LoginPage lp =new LoginPage();
		lp.userLogin("Ajay","AjayKumar");
		lp.userLogin("Ajay", "Kumar", "AZPW");
		lp.userLogin(701341, "Ajay Kumar");

	}

}
