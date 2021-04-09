package by.jonline.mod2.decomposition;

import java.util.Random;

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task4 {

	public static void main(String[] args) {

		int n = 5;
		int[] arrayX = new int[n];
		int[] arrayY = new int[n];
		int[] index;

		fillArray(arrayX, arrayY);

		System.out.print("Координаты точек:");
		for (int i = 0; i < arrayX.length; i++) {
			System.out.printf("( %3d, %3d )", arrayX[i], arrayY[i]);
		}

		index = maxDist(arrayX, arrayY);

		System.out.printf("\nМаксимальная дистанция между точками (%3d, %3d), (%3d, %3d), ", arrayX[index[0]],
				arrayY[index[0]], arrayX[index[1]], arrayY[index[1]]);

	}

	public static void fillArray(int[] arr1, int[] arr2) {

		Random random = new Random();

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = -10 + random.nextInt(21);
			arr2[i] = -10 + random.nextInt(21);
		}

	}

	public static int[] maxDist(int[] arrX, int arrY[]) {

		int[] arrIndex = new int[2];
		double maxD = 0;

		for (int i = 0; i < arrX.length - 1; i++) {
			for (int j = i + 1; j < arrY.length; j++) {
				double num = distance(arrX[i], arrY[i], arrX[j], arrY[j]);
				if (num > maxD) {
					arrIndex[0] = i;
					arrIndex[1] = j;
				}
			}
		}
		return arrIndex;

	}

	public static double distance(int x1, int y1, int x2, int y2) {
		double num = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return num;
	}

}
