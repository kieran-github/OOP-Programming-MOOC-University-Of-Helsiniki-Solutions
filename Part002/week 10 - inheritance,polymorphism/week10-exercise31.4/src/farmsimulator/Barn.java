package farmsimulator;

import java.util.Collection;

public class Barn {
	private BulkTank barnTank;
	private MilkingRobot barnRobot;

	public Barn(BulkTank tank) {
		this.barnTank = tank;
	}
	public BulkTank getBulkTank() {
		return this.barnTank;
	}
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.barnRobot = milkingRobot;
		this.barnRobot.setBulkTank(this.barnTank);
	}
	public void takeCareOf(Cow cow) {
		if (this.barnRobot == null) {
			throw new IllegalStateException();
		}
		else {
			this.barnRobot.milk(cow);
		}
	}
	public void takeCareOf(Collection<Cow>cows)
	{
		if (this.barnRobot == null) {
			throw new IllegalStateException();
		}
		else {
			for (Cow cow : cows) {
				this.barnRobot.milk(cow);
			}
		}
	}
	@Override
	public String toString() {

		return this.barnTank.toString();
	}
}
