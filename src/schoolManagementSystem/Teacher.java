package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private String employeeID;
	private double salary;
	private List<Float> ratings;
	private float rating;

	public Teacher(String name, int age, String gender, String employeeID, double salary, float rating) {
        super(name, gender, age);
        this.employeeID = employeeID;
        this.salary = salary;
        this.rating = rating;
        this.ratings = new ArrayList<>();
        this.ratings.add(rating); 
    }

	@Override
	String describeRole() {
		return "Teacher";

	}

	public void addRating(float rating) {
		ratings.add(rating);
	}

	public float calculateAvarageRating() {
		if (ratings.isEmpty()) {
			return 0;
		}
		float sum = 0;
		for (float rating : ratings) {
			sum += rating;
		}
		return sum / ratings.size();
	}
}
