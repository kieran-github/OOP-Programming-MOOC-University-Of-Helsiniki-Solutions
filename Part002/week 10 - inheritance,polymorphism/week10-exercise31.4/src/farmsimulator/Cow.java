package farmsimulator;

import java.util.Random;

import org.omg.PortableServer.ThreadPolicyOperations;

public class Cow implements Milkable, Alive{
	private Random random = new Random();
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
	
	private String name;
	private double capacity = 15 + (random.nextDouble() * 25);
	private double volume = 0;
	

	public Cow() {
		this.name = NAMES[random.nextInt(31)];
	}
	public Cow(String inputName) {
		this.name = inputName;
	}
	public String getName() {
		return this.name;
	}
	public double getCapacity() {
		return this.capacity;
	}
	public double getAmount() {
		return this.volume;
	}
	@Override
	public void liveHour() {
		double milkProduced =  random.nextDouble() + 0.7;
		if (milkProduced + this.volume >= this.capacity) {
			this.volume = this.capacity;
		}
		else {
			this.volume += milkProduced;
		}
		
	}
	@Override
	public double milk() {
		double currentMilk = this.volume;
		this.volume = 0.0;
		return currentMilk;

	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %.2f / %.2f", this.name, Math.ceil(this.volume), Math.ceil(this.capacity));
	}

}
