package Tests;

import Main.*;
import org.junit.*;

public class ScheduleIteratorTests {

	@Test
	public void testScheduleIteratorNext() {
		Schedule[] schedArr = ScheduleDataProvider.getSportsSchedules();
		ScheduleIterator iter = new ScheduleIterator(schedArr);
		int index = 0;
		while(index < schedArr.length){
			Assert.assertEquals(ScheduleDataProvider.getSportsSchedules()[index].activity, iter.next().activity);
			++index;
		}
	}


	@Test
	public void testScheduleIteratorHasNext() {
		Schedule[] schedArr = ScheduleDataProvider.getSportsSchedules();
		ScheduleIterator iter = new ScheduleIterator(schedArr);
		Schedule next = iter.next();
		while(next != null) {
			if(next == schedArr[schedArr.length - 1]){
				Assert.assertFalse(iter.hasNext());
			}
			else
			{
				Assert.assertTrue(iter.hasNext());
			}
			next = iter.next();
		}
	}

}
