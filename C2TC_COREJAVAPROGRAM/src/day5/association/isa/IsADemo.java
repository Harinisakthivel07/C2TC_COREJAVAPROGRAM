package day5.association.isa;

public class IsADemo {
	public static void main(String[] args) {

		Employee employee = new Employee("HARINI", 101, "ECET");
		Manager manager = new Manager("GOPI", 201, "CIVIL", 8);

		System.out.println(employee);
		System.out.println("---------------------------------------------------------------");
		System.out.println(manager);
	}

}
