package by.jonline.mod4.prog_with_classes.task3;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {

	private final static int NUMBEROFEXAMS = 5;

	private String studentName;
	private int groupNumber;
	private int[] academicPerformance = new int[NUMBEROFEXAMS];

	public Student() {

	}

	public Student(String studentName, int groupNumber) {
		this.setStudentName(studentName);
		this.setGroupNumber(groupNumber);
	}

	public Student(String studentName, int groupNumber, int[] academicPerformance) {
		this.setStudentName(studentName);
		this.setGroupNumber(groupNumber);
		this.setAcademicPerformance(academicPerformance);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getAcademicPerformance() {
		return academicPerformance;
	}

	public void setAcademicPerformance(int[] academicPerformance) {
		this.academicPerformance = academicPerformance;
	}

	@Override
	public String toString() {
		return "Student name: " + studentName + ", group: " + groupNumber + ", academic performance: "
				+ Arrays.toString(academicPerformance);
	}

}
