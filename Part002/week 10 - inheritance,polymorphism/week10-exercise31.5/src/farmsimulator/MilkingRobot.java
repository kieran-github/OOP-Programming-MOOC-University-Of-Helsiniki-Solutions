package farmsimulator;

public class MilkingRobot {
	private BulkTank myTank;

	public MilkingRobot() {
		// TODO Auto-generated constructor stub
	}
	public BulkTank getBulkTank() {
		return this.myTank;
	}
	public void setBulkTank(BulkTank inputTank){
		this.myTank = inputTank;
	}
	public void milk(Milkable milkable) {
		if (this.myTank == null) {
			throw new IllegalStateException();
		}
		else {
			this.myTank.addToTank(milkable.milk());
		}
	}
}
