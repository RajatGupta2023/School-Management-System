package schoolManagementSystem;

public abstract class Person {
	String name;
	String gender;
	int age;

	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	abstract String describeRole() ;
}
