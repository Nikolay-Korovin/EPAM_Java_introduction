package by.jonline.mod4.prog_with_classes.task3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Main {

	public static void main(String[] args) {
		Logic logic = new Logic();
		Student[] student = new Student[10];
		int[] performance;

		// генерируем студентов
		for (int i = 0; i < student.length; i++) {
			performance = new int[5];
			for (int j = 0; j < performance.length; j++) {
				performance[j] = (int) Math.round(Math.random() * 2 + 8); // интересный вариант генерации от и до
			}

			student[i] = new Student("Student" + i, 10 + i, performance);
		}

		System.out.println("Студенты:");
		for (Student s : student) {
			System.out.println(s);
		}

		System.out.println("Студенты отличники: ");
		for (Student s : student) {
			if (logic.isExcellentStudent(s.getAcademicPerformance())) {
				System.out.println(s);
			}
		}
	}

}
