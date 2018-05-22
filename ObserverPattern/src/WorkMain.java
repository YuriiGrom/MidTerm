
public class WorkMain {

	public static void main(String[] args) {
		
		WorkManager workManager = new WorkManager();
		
		Workers worker1 = new Workers(workManager);
		Workers worker2 = new Workers(workManager);
		Workers worker3 = new Workers(workManager);
		Workers worker4 = new Workers(workManager);
		
		workManager.newWorkItem("AA", 1, "Do this work");
		workManager.newWorkItem("AB", 2, "Do this work");
		workManager.newWorkItem("AC", 3, "Do this work");
		workManager.newWorkItem("AD", 4, "Do this work");
		
	}

}
