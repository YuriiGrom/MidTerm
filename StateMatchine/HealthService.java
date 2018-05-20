
public class HealthService {
	
	State unknown;
	State ready;
	State disabled;
	State down;
	
	State state;
	boolean check = false;
	boolean timeCheck = false;
	boolean serviceCheck = false;
	
	public HealthService (boolean check, boolean timecheck, boolean serviceCheck) {
		unknown = new Unknown(this);
		ready = new Ready(this);
		disabled = new Disabled(this);
		down = new Down(this);
		
		state = unknown;
		
	}
	
	void setState (State state) {
		this.state = state;	
	}
	
	public void healthCheck(boolean check) {
		state.healthCheck(check);
	}

	public void timeOut(boolean timeCheck) {
		state.timeOut(timeCheck);
	}
	
	public void serviceCheck(boolean serviceCheck) {
		state.serviceCheck(serviceCheck);
	}
	
	public State getState() {return state;}
	public State getUnknown() {return unknown;}
	public State getReady() {return ready;}
	public State getDisabled() {return disabled;}
	public State getDown() {return down;}
	
	
}


