package Main;
import java.util.Iterator;

public abstract class baseSchedule {
	public Schedule[] schedules;
	
	public void setSchedule(Schedule[] schedules) {
		this.schedules = schedules;
	}
	
	public void addItem(Schedule item) {
		schedules[schedules.length] = item;
	}
	
	abstract Iterator<Schedule> createIterator();
}
