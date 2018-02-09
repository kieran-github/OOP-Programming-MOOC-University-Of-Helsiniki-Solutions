package application;

import java.util.ArrayList;

public class AverageSensor implements Sensor{

	private ArrayList<Sensor>sensors;
	private boolean flag;
	
	public AverageSensor() {
		this.sensors = new ArrayList<Sensor>();
	}

	public void addSensor(Sensor additional) {
		this.sensors.add(additional);
	}
	
	@Override
	public boolean isOn() {
		for (Sensor sensor : sensors) {
			if (sensor.isOn() != true) {
				flag = false;
			}
			else {
				flag = true;
			}
		}
		return flag;
	}

	@Override
	public void on() throws Exception {
		for (Sensor sensor : sensors) {
			if (sensor.isOn() != true) {
				flag = false;
			}
			else if (this.sensors.size() == 0) {
				throw new java.lang.IllegalStateException();
			}
			else {
				flag = true;
			}
		}
	}
	
	@Override
	public void off() {
		if (this.flag == false) {
			for (Sensor sensor : sensors) {
				sensor.off();
			}
		}
	}

	@Override
	public int measure() throws Exception {
		int sum = 0;
		if (this.flag) {
			for (Sensor sensor : sensors) {
				sum = sum + sensor.measure();
			}
		}
		else {
			throw new java.lang.IllegalStateException();
		}
		return sum / this.sensors.size();
	}

}
