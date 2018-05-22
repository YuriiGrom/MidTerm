import java.util.*;

public class WorkManager implements Subject {
	
	private ArrayList<Observer> observers;
	private String ID;
	private long WorkerID;
	private String Message;
	
	public WorkManager () {
		
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		
		for (Observer observer : observers) {
			observer.update(ID, WorkerID, Message);
		}
	}
	
	public void workItemChanged() {
		
		notifyObservers();
	}
	
	public void newWorkItem(String ID, long WorkerID, String Message) {
		this.ID = ID;
		this.WorkerID = WorkerID;
		this.Message = Message;
		workItemChanged();
	}

}
