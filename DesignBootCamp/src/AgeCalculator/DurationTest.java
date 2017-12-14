package AgeCalculator;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DurationTest {
	private final Duration duration = new Duration();


	@Test
	public void shouldcalculateAgeInHours() {
		Date twoHoursOld = past(2*Duration.MILLIS_IN_HOURS);
		String answer = duration.since(twoHoursOld);
		assertEquals("2 Hours",answer );
	}
	@Test
	public void shouldcalculateAgeInDays() {
		Date fiveDaysOld = past(5*Duration.MILLIS_IN_DAYS);
		String answer = duration.since(fiveDaysOld);
		assertEquals("5 Days",answer );
	}
	@Test
	public void shouldcalculateAgeInMonths() {
		Date sevenMonthsOld = past(7*Duration.MILLIS_IN_MONTHS);
		String answer = duration.since(sevenMonthsOld);
		assertEquals("7 Months",answer );
	}
	@Test
	public void shouldcalculateAgeInYears() {
		Date twelveYearsOld = past(12*Duration.MILLIS_IN_YEARS);
		String answer = duration.since(twelveYearsOld);
		assertEquals("12 Years",answer );
	}
	@Test
	public void shouldRegisterNewDurationAndGiveAgeInNewDuration()
	{
		Date threeWeeksOld = past(21*Duration.MILLIS_IN_DAYS);
		String answer = duration.since(threeWeeksOld);
		assertEquals("21 Days",answer);
		duration.register(7, "Weeks");
		assertEquals("3 Weeks",answer);

	}
	
	private Date past(long delta) {
		Long desiredTime  = Calendar.getInstance().getTimeInMillis() - delta;
		Calendar.getInstance().setTimeInMillis(desiredTime);
		return Calendar.getInstance().getTime();
		// TODO Auto-generated method stub
	}

}
