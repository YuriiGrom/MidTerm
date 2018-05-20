
public class Ready implements State {
	
	HealthService healthService;
	
	public Ready(HealthService healthService) {
		this.healthService = healthService;
	}

	@Override    //if true than good, if false than bad
	public void healthCheck(boolean check) {
		if (check == false) {
			System.out.println("Health check is bad. Service is in Down State\n");
			healthService.setState(healthService.getDown());
		}

	}

	@Override   //if true than time is out, if false than not out
	public void timeOut(boolean timeCheck) {
		if (timeCheck == true) {
			System.out.println("Service health check times out. Service is in Unknown State\n");
			healthService.setState(healthService.getUnknown());
		}

	}

	@Override   //if true than enabled, if false than disabled
	public void serviceCheck(boolean serviceCheck) {
		if (serviceCheck == false) {
			System.out.println("Service got disabled by user. Service is in Disabled State\n");
			healthService.setState(healthService.getDisabled());
		}

	}

}
