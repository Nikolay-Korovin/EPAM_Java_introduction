package by.jonline.mod2.decomposition;

//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

public class Task3 {

	public static void main(String[] args) {

		double a = 14;
		System.out.println("Площадь правильного шестиугольника со стороной " + a + " = " + hexagonArea(a));

	}

	public static double hexagonArea(double a) {

		return triangleArea(a) * 6;

	}

	public static double triangleArea(double a) {

		return ((a * a * Math.pow(2, 3)) / 4);

	}
}
