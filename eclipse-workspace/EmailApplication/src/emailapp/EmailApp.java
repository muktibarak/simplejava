package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email email1 = new Email("Mukti", "Barak");
		//shoInfo method is called and printed here
		System.out.println(email1.showInfo());
		
		//lets check if getter and setter in Email class is working fine
		email1.setAlternateEmail("mb@mycompany.com");
//		System.out.println("This is your alternate email: " + email1.getAlternateEmail());
	}

}
