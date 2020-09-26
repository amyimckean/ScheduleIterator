package Main;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ScheduleDataProvider {
	public static Schedule[] getSportsSchedules() {
		return new Schedule[] {
			new Schedule("Baseball", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Football", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Tennis", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Gymnastic", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Volleyball", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now())
		};
	}
	
	public static Schedule[] getMusicalSchedules() {
		return new Schedule[] {
			new Schedule("Piano", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Drums", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Cello", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Viola", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now()),
			new Schedule("Flute", LocalDateTime.of(LocalDate.of(1985, 4, 21), LocalTime.now()), LocalDateTime.now())
		};
	}
}
