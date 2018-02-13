package farmsimulator;

import java.awt.Robot;
import java.util.ArrayList;


public class Farm implements Alive{
	private String ownerName;
	private Barn myBarn;
	private ArrayList<Cow>cows;
	
	public Farm(String inputOwnerName, Barn inputBarn) {
		this.ownerName = inputOwnerName;
		this.myBarn = inputBarn;
		this.cows = new ArrayList<Cow>();
		
	}
	public void manageCows() {
		this.myBarn.takeCareOf(this.cows);
	}
	public void installMilkingRobot(MilkingRobot robot) {
		this.myBarn.installMilkingRobot(robot);
	}
	public void addCow(Cow inputCow)
	{
		this.cows.add(inputCow);
	}
	public String getOwner() {
		return this.ownerName;
	}
	private String getCows() {
		String buffer = "";
		if (this.cows.isEmpty()) {
			buffer += "No cows";
		}
		else {
			for (Cow cow : cows) {
				buffer += "	" + cow.toString() + "\n";
			}
			buffer = "Animals: \n" + buffer;
		}
		return buffer;

	}
	@Override
	public String toString() {
        return "Farm owner: " + this.getOwner() + "\nBarn bulk tank: " + this.myBarn +
                "\n" + this.getCows();
	}
	@Override
	public void liveHour() {
		for (Cow cow : cows) {
			cow.liveHour();
		}
		
	}

}
