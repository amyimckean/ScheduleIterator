
public class ScheduleIteratorRunner {

	public static void main(String[] args) {
		AthleticSchedule aSched = new AthleticSchedule();
		MusicalSchedule mSched = new MusicalSchedule();
		
		aSched.setSchedule(ScheduleDataProvider.getSportsSchedules());
		mSched.setSchedule(ScheduleDataProvider.getMusicalSchedules());
		
		Scheduler scheduler = new Scheduler(aSched, mSched);
		
		scheduler.printSchedule();
	}
}
