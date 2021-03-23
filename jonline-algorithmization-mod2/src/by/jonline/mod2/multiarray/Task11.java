package by.jonline.mod2.multiarray;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в

//которых число 5 встречается три и более раз.

public class Task11 {

	public static void main(String[] args) {

		int[][] array = new int[10][20];

		for (int i = 0; i < array.length; i++) {
			int counter = 0;

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 15);
				System.out.printf("%2d ", array[i][j]);//вариант вывода для наглядности, сразу после обнаружения
													   //нужной строки
				if (array[i][j] == 5)
					counter++;
			}

			if (counter >= 3) {
				System.out.print("Строка " + (i + 1) + " ");
			}

			System.out.println();

		}
		
		System.out.println();
		System.out.print("Строки в которых цифра 5 встречается 3 и более раз: ");//вариант вывода второй(если надо отдельно)
		for (int i = 0; i < array.length; i++) {
			int counter = 0;
			for (int e : array[i]) {
				if (e == 5) {
					counter++;
				}
			}
			if (counter >= 3) {
				System.out.print((i + 1) + " ");
			}
		}

	}

}
