package day5.association.hasa;

public class Executor {

	public static void main(String[] args) {
		Address address = new Address("405 Laxmi Enclave, Pandit Colony", "Nashik", "Tamilnadu", "422003");
		Person person = new Person("HARINI", address);
		person.displayInfo();

	}

}
