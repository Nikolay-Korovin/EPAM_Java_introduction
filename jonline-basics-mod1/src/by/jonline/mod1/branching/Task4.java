package by.jonline.mod1.branching;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

public class Task4 {

	public static void main(String[] args) {

		int a = 7;
		int b = 5;

		int x = 3;
		int y = 5;
		int z = 5;

		int hole;
		
		int brick1;
		int brick2;
		
		// минимальная сторона отверстия
		if (a < b | a == b) {
			hole = a;
		} else
			hole = b;
		
		// средняя и минимальная сторона в кирпиче
		if ((x <= y && x <= z)) {
			if (y <= z) {
				brick1 = x;
				brick2 = y;
			} else {
				brick1 = x;
				brick2 = z;
			}
		} else {
			brick1 = y;
			brick2 = z;
		}
		// пройдёт ли кирпич
		if (brick1 <= hole && brick2 <= hole) {
			System.out.println("Кирпич пройдёт");
		} else
			System.out.println("Кирпич не пройдёт");

	}

}
