package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {

	List<Student> studentRoster = new ArrayList<>();
	List<Person> personRoster = new ArrayList<>();

	public void addToStudentRoster(Student student) {
		this.studentRoster.add(student);
	}

	public void sortStudentRoster(Comparator<Student> s) {
		this.studentRoster.sort(s);
	}

	public void addToPersonRoster(Person person) {
		this.personRoster.add(person);

	}

	public void sortPersonRoster(Comparator<Person> p) {
		this.personRoster.sort(p);

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("### Student List ###\n");
		for (Student s : studentRoster) {
			sb.append(s + "\n");
		}

		sb.append("\n### Person List ###\n");
		for (Person p : personRoster) {
			sb.append(p + "\n");
		}
		return sb.toString();
	}

	public static void demo() {

		School school = new School();
		school.addToPersonRoster(new Person(9, 19, "Smith"));
		school.addToPersonRoster(new Person(1, 24, "Johnson"));
		school.addToPersonRoster(new Person(10, 22, "Martin"));
		school.addToPersonRoster(new Person(30, 23, "Hill"));
		school.addToPersonRoster(new Person(2, 20, "Lopez"));

		school.addToStudentRoster(new Student(12, 25, "Scott", 4.0));
		school.addToStudentRoster(new Student(50, 21, "Adams", 3.5));
		school.addToStudentRoster(new Student(33, 23, "Carter", 3.8));
		school.addToStudentRoster(new Student(21, 23, "Hall", 3.7));
		school.addToStudentRoster(new Student(8, 26, "Lee", 3.3));

		System.out.println("Sort by ID: ");
		school.sortStudentRoster(Student::compareById);
		school.sortPersonRoster(Person::compareById);
		System.out.println(school);

		System.out.println("Sort by Age: ");
		school.sortStudentRoster(Student::compareByAge);
		school.sortPersonRoster(Person::compareByAge);
		System.out.println(school);

		System.out.println("Sort by Last Name: ");
		school.sortStudentRoster(Student::compareByLastName);
		school.sortPersonRoster(Person::compareByLastName);
		System.out.println(school);

		System.out.println("Sort by GPA: ");
		school.sortStudentRoster(Student::compareByGpa);
		System.out.println(school);

	}

}
