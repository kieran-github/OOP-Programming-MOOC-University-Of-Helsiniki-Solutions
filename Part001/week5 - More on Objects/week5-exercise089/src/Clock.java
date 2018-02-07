import java.security.KeyStore.PrivateKeyEntry;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Clock {
	private BoundedCounter hours;
	private BoundedCounter minutes;
	private BoundedCounter seconds;
	
	public Clock(int hoursAtStart, int minutesAtStart, int secondsAtBeginnig) {
		this.hours = new BoundedCounter(hoursAtStart);
		this.minutes = new BoundedCounter(minutesAtStart);
		seconds = new BoundedCounter(secondsAtBeginnig);
	}
	public void tick() {
			seconds.next();
			if (seconds.getValue() == 59) {
				minutes.next();
				if (minutes.getValue() == 59) {
					hours.next();
					if (hours.getValue()==24) {
						hours.setValue(0);
					}
				}
			}
		}
	@Override
	public String toString() {
		return this.hours.getValue() + ":" + this.minutes.getValue() + ":" + this.seconds.getValue();
		
	}	
}
