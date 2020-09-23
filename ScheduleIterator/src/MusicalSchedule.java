import java.util.Iterator;

public class MusicalSchedule extends baseSchedule{
	final int MAX_Schedules = 10;
	
	public MusicalSchedule() {
		this.schedules = new Schedule[MAX_Schedules];
	}
	
	public Iterator<Schedule> createIterator() {
		return new ScheduleIterator(schedules);
	}
}
