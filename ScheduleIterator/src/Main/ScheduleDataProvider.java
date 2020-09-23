package Main;
import java.time.LocalDateTime;

public class ScheduleDataProvider {
	public static Schedule[] getSportsSchedules() {
		return new Schedule[] {
			new Schedule("Baseball", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Football", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Tennis", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Gymnastic", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Volleyball", LocalDateTime.now(), LocalDateTime.now()),
		};
	}
	
	public static Schedule[] getMusicalSchedules() {
		return new Schedule[] {
			new Schedule("Piano", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Drums", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Cello", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Viola", LocalDateTime.now(), LocalDateTime.now()),
			new Schedule("Flute", LocalDateTime.now(), LocalDateTime.now()),
		};
	}
}
