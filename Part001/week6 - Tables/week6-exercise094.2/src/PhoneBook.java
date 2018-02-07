import java.util.ArrayList;

public class PhoneBook {
	private ArrayList<Person>list = new ArrayList<Person>();
	public void add(String name, String number) {
		Person p = new Person(name, number);
		list.add(p);
	}
	public void printAll() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
}
