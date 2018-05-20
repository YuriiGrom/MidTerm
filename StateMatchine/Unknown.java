
public class Unknown implements State {
	
	HealthService healthService;
	
	public Unknown(HealthService healthService) {
		this.healthService = healthService;
	}

	@Override    //if true than good, if false than bad
	public void healthCheck(boolean check) {
		if (check == true) {
			System.out.println("Health check is good. Service is in Ready State\n");
			healthService.setState(healthService.getReady());
		}
		else {
			System.out.println("Health check is bad. Service is in Down State\n");
			healthService.setState(healthService.getDown());
		}
	}

	@Override     //if true than time is out, if false than not out
	public void timeOut(boolean timeCheck) {
		if (timeCheck == true) {
			System.out.println("Service health check times out. Service is in Down State\n");
			healthService.setState(healthService.getDown());
		}
		
	}

	@Override    //if true than enabled, if false than disabled
	public void serviceCheck(boolean serviceCheck) {
		
	}

}
