
public class HealthServiceTest {

	public static void main(String[] args) {
		
		HealthService healthService = new HealthService(false, false, false);
		
		System.out.println("Health Service");
//		checking links between Unknown and Ready
		healthService.healthCheck(true);
		healthService.timeOut(true);
		
//		checking links between Unknown, Down, and Ready
		healthService.timeOut(true);
		healthService.healthCheck(true);
		healthService.timeOut(true);
		healthService.healthCheck(false);
		healthService.healthCheck(true);
		healthService.healthCheck(false);
		
//		checking links between Ready, Disabled, and Unknown
		healthService.healthCheck(true); //back to Ready from Down
		healthService.serviceCheck(false);
		healthService.serviceCheck(true);
		
		
		
		
		
		
		
		
		


	}

}
