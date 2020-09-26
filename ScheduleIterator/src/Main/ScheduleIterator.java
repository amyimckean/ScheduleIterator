package Main;
import java.util.Iterator;

public class ScheduleIterator implements Iterator {
	Schedule[] schedules;
	int index = 0;
	
	public ScheduleIterator(Schedule[] schedules) {
		this.schedules = schedules;
	}
	
	public boolean hasNext() {
		if(index < schedules.length && schedules[index] != null) {
			return true;
		}
		return false;
	}

	public Schedule next() {
		if(!hasNext()) {return null;}
		Schedule current = schedules[index];
		++index;
		return current;
	}

}
