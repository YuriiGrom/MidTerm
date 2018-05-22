
public class Workers implements Observer {
	
	private String ID;
	private long WorkerID;
	private String Message;
	
	private static int observerIDTracker = 0;
	private int observerID;
	
	private Subject WorkManager;
	
	public Workers (Subject WorkManager) {
		
		this.WorkManager = WorkManager;
		this.observerID = ++observerIDTracker;
		WorkManager.registerObserver(this);
	}

	@Override
	public void update(String ID, long WorkerID, String Message) {
		
		this.ID = ID;
		this.WorkerID = WorkerID;
		this.Message = Message;
		check();
	}
	
	public void check() {

		if (observerID == WorkerID) {
			returnWork();
		}
		else if (observerID == 4){
			
			System.out.println("Worker "+ observerID + ": not for me\n");	
		}
		else {
			System.out.println("Worker "+ observerID + ": not for me");	
		} 
	}
	
	public void returnWork() {
		
		System.out.println("Worker " + WorkerID + " processed WorkItem " + ID );
	}

}
