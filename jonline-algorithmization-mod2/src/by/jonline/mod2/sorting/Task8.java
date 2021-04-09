package by.jonline.mod2.sorting;

import java.util.Arrays;

//8. даны дроби p[1]/q[1], p[2]/q[2], ... , p[n]/q[n] (p,q - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

public class Task8 {

	public static void main(String[] args) {

		Fraction[] arr = { new Fraction(1, 4), new Fraction(5, 4), new Fraction(3, 8), new Fraction(2, 4) };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sortingCommonDenominator(arr)));

	}

	public static Fraction[] sortingCommonDenominator(Fraction[] arr) {
		double[] denominators = new double[arr.length];
		double commonDenominator = 0;

		for (int i = 0; i < arr.length; i++) { // массив с деноминаторами
			denominators[i] = arr[i].den;
		}

		commonDenominator = searchCommonDen(denominators); // находим наименьший общий делитель(деноминатор)

		for (int i = 0; i < arr.length; i++) { // приводим всё к общему знаменателю
			double multiplier;
			multiplier = commonDenominator / arr[i].den;
			arr[i].den = commonDenominator;
			arr[i].num = arr[i].num * multiplier;
		}

		for (int i = 0; i < arr.length; i++) { // сортируем

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j].num > arr[j + 1].num) {
					Fraction num = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = num;
				}

			}

		}

		return arr;
	}

	public static double searchCommonDen(double[] arr) {
		double maxNum = 0;
		double commonDenominator = 0;
		boolean condition = false;

		for (double i : arr) { // находим максимальный знаменатель
			if (i > maxNum) {
				maxNum = i;
			}
		}

		for (int i = 0; i < arr.length - 1; i++) { // проверяем максимальный знаменатель, не является ли он общим
			condition = false;
			if (maxNum % arr[i] == 0) {
				condition = true;
			}

		}

		if (condition == true) {  // если максимальный знаменатель по предыдущему for общий, то просто возвращаем его
			commonDenominator = maxNum;

		} else {

			for (int i = 2; condition != true; i++) { // ищем умножая на 2 максимальный элемент из нодОв
				int counter = 0;
				double maxNumTemp = maxNum;
				maxNumTemp = maxNumTemp * i;
				commonDenominator = maxNumTemp;

				for (int j = 0; j < arr.length; j++) {
					condition = false;
					if (maxNumTemp % arr[j] != 0) {
						condition = false;
						break;
					} else {
						counter++;
					}
				}

				if (counter == arr.length) {
					condition = true;
				}

			}

		}
		return commonDenominator;
	}

}

class Fraction {
	double num;
	double den;

	public Fraction(double num, double den) {
		this.num = num;
		this.den = den;
	}

	public String toString() {
		return num + "/" + den;
	}
}
