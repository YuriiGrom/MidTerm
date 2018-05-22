import java.util.Scanner;

public class UserMenuCode {
	
	HealthService healthService = new HealthService(false, false, false);
	Scanner scan = new Scanner(System.in);

	
	public void userUnknown() {
		System.out.println("Test it by choosing if: 1.Health Check is good 2.Health Check is bad 3.Service times out (Type in 1, 2, or 3)");
		int input = scan.nextInt();
		if (input == 1) {
			healthService.healthCheck(true);
			userReady();
		
		}else if (input == 2) {
			healthService.healthCheck(false);
			userDown();
			
		}else if (input == 3) {
			healthService.timeOut(true);
			userDown();
			
		}else {
			System.out.println("Invalid Input");
			userUnknown();
		}
	}

	private void userDown() {
		System.out.println("Choose: 1.Health Check is good");
		int input = scan.nextInt();
		if (input == 1) {
			healthService.healthCheck(true);
			userReady();
		}else {
			System.out.println("Invalid Input");
			userDown();
		}
	}

	private void userReady() {
		System.out.println("Choose: 1.Service times out 2.Service got disabled by user 3.Health Check is bad");
		int input = scan.nextInt();
		if (input == 1) {
			healthService.timeOut(true);
			userUnknown();
		
		}else if (input == 2) {
			healthService.serviceCheck(false);
			userDisabled();
			
		}else if (input == 3) {
			healthService.healthCheck(false);
			userDown();
			
		}else {
			System.out.println("Invalid Input");
			userReady();
		}

	}

	private void userDisabled() {
		System.out.println("Choose: 1.Service got enabled by the user");
		int input = scan.nextInt();
		if (input == 1) {
			healthService.serviceCheck(true);
			userUnknown();
		}else {
			System.out.println("Invalid Input");
			userDisabled();
		}
		

}
}
