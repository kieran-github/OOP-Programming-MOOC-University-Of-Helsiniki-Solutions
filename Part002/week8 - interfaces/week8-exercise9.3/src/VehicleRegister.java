import java.util.HashMap;

public class VehicleRegister {
	private HashMap<RegistrationPlate, String>owners = new HashMap<RegistrationPlate, String>();
	
	public boolean add(RegistrationPlate plate, String owner) {
		if (!this.owners.containsKey(plate)) {
			owners.put(plate, owner);
			return true;
		}
		else {
			return false;
		}
	}
	public String get(RegistrationPlate plate) {
		if (this.owners.containsKey(plate)) {
			return owners.get(plate);
		}
		else {
			return null;
		}
	}
	public boolean delete(RegistrationPlate plate) {
		if (owners.containsKey(plate)) {
			owners.remove(plate);
			return true;
		}
		else {
			return false;
		}
	}
	public void printRegistrationPlates() {
		for (RegistrationPlate r : this.owners.keySet()) {
			System.out.println(r.toString());
		}
	}
	public void printOwners() {
		for (String owner : this.owners.values()) {
			System.out.println(owner);
		}
	}

}
