import java.util.Iterator;

public class Scheduler {
	baseSchedule athletic;
	baseSchedule musical;
	int index = 1;
	
	public Scheduler(baseSchedule musical, baseSchedule athletic) {
		this.athletic = athletic;
		this.musical = musical;
	}
	
	public void printSchedule() {
		Iterator aIterator = athletic.createIterator();
		Iterator mIterator = musical.createIterator();

		printIterators(aIterator);
		printIterators(mIterator);
	}
	
	private void printIterators(Iterator iter) {
		System.out.println("Schedule #" + index);
		while(iter.hasNext()){
			Schedule item = (Schedule) iter.next();
			String printThis = String.format("%1$s will start at %2$s and end at %3$s", item.activity, item.start.toString(), item.end.toString());
			System.out.println(printThis);
		}
		System.out.println();
		++index;
	}
}
