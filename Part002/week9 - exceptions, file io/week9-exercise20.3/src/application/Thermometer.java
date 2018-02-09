package application;

import java.util.Random;

public class Thermometer implements Sensor{
	private static final Exception IllegalStateException = null;
	private Random random;
	private boolean flag;

	public Thermometer() {
		this.off();
	}
	
	@Override
	public boolean isOn() {
		// TODO Auto-generated method stub
		return flag;
	}

	@Override
	public void on() {
		this.flag = true;
		
	}

	@Override
	public void off() {
		this.flag = false;
		
	}

	@Override
	public int measure() throws Exception {
		random = new Random();
		int randInt = random.nextInt(30) - 30;
		if (this.isOn()) {
			return randInt;
		}
		else {
			throw new java.lang.IllegalStateException();
		}
	}

}
