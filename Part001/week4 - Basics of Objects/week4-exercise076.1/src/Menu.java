import java.util.ArrayList;

public class Menu {
	private ArrayList<String>meals;
	public Menu() {
		this.meals = new ArrayList<String>();
	}
	
	public void addMean(String meal) {
		if (this.meals.contains(meal)) {
			System.out.println("The menu already contains this meal. ");
		}
		else {
			this.meals.add(meal);
		}
	}
}
