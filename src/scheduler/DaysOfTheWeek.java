package scheduler;

public enum DaysOfTheWeek {
	SUNDAY,MONDAY,TUESDAY,WEDSDAY,THURSDAY,FRIDAY,SATURDAY;
	String day; //M,T,W.
	
	LinkedList<Scheduler> events = new LinkedList<Scheduler>();
		Scheduler sch = new Scheduler();
		//im so screwed
}
