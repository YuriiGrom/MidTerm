
public interface State {
	
	public void healthCheck(boolean check);
	public void timeOut(boolean timeCheck);
	public void serviceCheck(boolean serviceCheck);

}
