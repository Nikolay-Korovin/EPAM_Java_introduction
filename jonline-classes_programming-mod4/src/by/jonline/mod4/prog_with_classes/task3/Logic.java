package by.jonline.mod4.prog_with_classes.task3;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
//из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Logic {

	public boolean isExcellentStudent(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 9) {
				return false;
			}
		}
		return true;
	}

	

}
