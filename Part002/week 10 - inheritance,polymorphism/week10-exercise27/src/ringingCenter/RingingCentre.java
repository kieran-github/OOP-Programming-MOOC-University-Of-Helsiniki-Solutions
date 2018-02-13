package ringingCenter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
	private Map<Bird, List<String>>observationsListed;

	
	public RingingCentre() {
		this.observationsListed = new HashMap<Bird, List<String>>();
	}

	public void observe(Bird inputBird, String place) {
		if (!this.observationsListed.containsKey(inputBird)) {
			this.observationsListed.put(inputBird, new ArrayList<String>());
		}
		this.observationsListed.get(inputBird).add(place);
	}
	
	public void observations(Bird inputBird) {
		if (!this.observationsListed.containsKey(inputBird)) {
			System.out.println(inputBird.toString() + "observations: 0");
		}
		else
		{
			System.out.println(inputBird.toString() + "observations: " + this.observationsListed.get(inputBird).size());
			for (String p : this.observationsListed.get(inputBird)) {
				System.out.println(p);
			}
		}
	}
}
