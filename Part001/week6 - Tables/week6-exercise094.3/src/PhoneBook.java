import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<Person>list = new ArrayList<Person>();
	private String buffer;
	public void add(String name, String number) {
		Person p = new Person(name, number);
		list.add(p);
	}
	public void printAll() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
	public String searchNumber(String name) {
		for (Person person : list) {
			if (person.getName().equals(name)) {
				return person.getNumber();
			}
		}
		return "number not known";
	}
}
