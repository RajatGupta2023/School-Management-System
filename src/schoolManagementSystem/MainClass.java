package schoolManagementSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Springfield High School Stream Allocation and Teacher Rating System!\n");

        System.out.print("Please enter the student's name: ");
        String studentName = scanner.nextLine();
        System.out.print("Please enter the student's age: ");
        int studentAge = Integer.parseInt(scanner.nextLine());
        System.out.print("Please enter the student's gender: ");
        String studentGender = scanner.nextLine();
        System.out.print("Please enter the student's academic percentage: ");
        double studentPercentage = Double.parseDouble(scanner.nextLine());

        Student student = new Student(studentName, studentGender, studentAge, "S001", studentPercentage);
        String stream = student.determineStream();
        System.out.println("\n-- Stream Allocation Result --");
        System.out.println("Name: " + student.name + ", Age: " + student.age + ", Gender: " + student.gender + ", Academic Percentage: " + student.percentage + "%");
        System.out.println("Allocated Stream: " + stream);

        School school = new School("Springfield High School");

        // Adding teachers to the school
        Teacher teacher1 = new Teacher("Pawan", 35, "Female", "T001", 50000,3.2f);
        Teacher teacher2 = new Teacher("Suresh", 40, "Male", "T002", 55000,4.8f);
        Teacher teacher3 = new Teacher("Randhir", 45, "Female", "T003", 52000,4.5f);
        Teacher teacher4 = new Teacher("Ravinder", 38, "Male", "T004", 48000,4.1f);
        school.addTeacher(teacher1);
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);
        school.addTeacher(teacher4);

        System.out.println("\nAvailable Teachers for Rating:");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println("- " + teacher.name);
        }

        System.out.print("\nPlease enter the teacher's name you wish to rate: ");
        String teacherName = scanner.nextLine();
        System.out.print("Please enter your rating for " + teacherName + ": ");
        int teacherRating = Integer.parseInt(scanner.nextLine());

        Teacher teacher = school.findTeacherByName(teacherName);
        if (teacher != null) {
            student.rateTeacher(teacher, teacherRating);
            double averageRating = teacher.calculateAvarageRating();
            System.out.println("\n-- Updated Teacher Rating --");
            System.out.println("Teacher: " + teacher.name);
            System.out.println("New Average Rating: " + averageRating);
        } else {
            System.out.println("Teacher not found in the school.");
        }
        scanner.close();
    }

}
