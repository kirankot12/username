package usernamegen;
import java.util.Scanner;
public class usernamegen {

	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		
		String user, pass;
		
		System.out.print("enter user name : ");
		user = console.nextLine();
		System.out.print("Enter Password: ");
		pass = console.nextLine();
		
		if (user.equals("admin") && (pass.equals("backdoor"))){
			System.out.println("Welcome Back");
		}else {
			System.out.println("Wrong Username or password");
		}
		
		

	}

}
