
public class Down implements State {
	
	HealthService healthService;
	
	public Down(HealthService healthService) {
		this.healthService = healthService;
	}

	@Override //if true than good, if false than bad
	public void healthCheck(boolean check) {
		if (check == true) {
			System.out.println("Health check is good. Service is in Ready State\n");
			healthService.setState(healthService.getReady());
		}

	}

	@Override
	public void timeOut(boolean timeCheck) {
		
	}

	@Override
	public void serviceCheck(boolean serviceCheck) {
		

	}

}
