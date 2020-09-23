import java.util.Iterator;

public class AthleticSchedule extends baseSchedule{
	final int MAX_Schedules = 10;
	
	public AthleticSchedule() {
		this.schedules = new Schedule[MAX_Schedules];
	}
	public Iterator<Schedule> createIterator() {
		return new ScheduleIterator(schedules);
	}
}
