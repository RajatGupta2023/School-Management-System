package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
	private String name;
    private List<Teacher> teachers;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.setTeachers(new ArrayList<>());
        this.students = new ArrayList<>();
    }

    void addTeacher(Teacher teacher) {
        getTeachers().add(teacher);
    }

    void addStudent(Student student) {
        students.add(student);
    }

    Teacher findTeacherByName(String name) {
        for (Teacher teacher : getTeachers()) {
            if (teacher.name.equals(name)) {
                return teacher;
            }
        }
        return null;
    }

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
}
