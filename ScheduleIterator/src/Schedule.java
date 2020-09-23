import java.time.LocalDateTime;

public class Schedule{
	String activity;
	LocalDateTime start;
	LocalDateTime end;
	
	public Schedule(String activity, LocalDateTime start, LocalDateTime end) {
		this.activity = activity;
		this.start = start;
		this.end = end;
	}
}
