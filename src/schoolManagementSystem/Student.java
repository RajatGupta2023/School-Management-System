package schoolManagementSystem;

public class Student extends Person {
	String studentID;
	double percentage;

	public Student(String name, String gander, int age, String studentID, double percentage) {
		super(name, gander, age);
		this.studentID = studentID;
		this.percentage = percentage;
	}

	@Override
	String describeRole() {
		return "Student";

	}

	public String determineStream() {
		if (percentage >= 85) {
			return "Non-medical";
		} else if (percentage >= 75 && percentage < 85) {
			return "Medical";
		} else if (percentage >= 65 && percentage < 75) {
			return "Commerce";
		} else {
			return "Arts";
		}
	}

	public void rateTeacher(Teacher teacher, int rating) {
		teacher.addRating(rating);
	}

}
