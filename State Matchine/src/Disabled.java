
public class Disabled implements State {
	
	HealthService healthService;
	
	public Disabled(HealthService healthService) {
		this.healthService = healthService;
	}

	@Override   //if true than good, if false than bad
	public void healthCheck(boolean check) {
		

	}

	@Override //if true than time is out, if false than not out
	public void timeOut(boolean timeCheck) {
		

	}

	@Override  //if true than enabled, if false than disabled
	public void serviceCheck(boolean serviceCheck) {
		if (serviceCheck == true) {
			System.out.println("Service got enabled by user.Service is in Unknown State\n");
			healthService.setState(healthService.getUnknown());
		}

	}

}
