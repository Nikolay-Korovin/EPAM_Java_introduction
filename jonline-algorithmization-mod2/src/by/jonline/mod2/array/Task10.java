package by.jonline.mod2.array;

import java.util.Arrays;

//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.


public class Task10 {

	public static void main(String[] args) {

		int[] mas = { 1, 2, -3, -1, -3, -3, -1, 14, 4, 100, -1 };

		System.out.println("заданный массив " + Arrays.toString(mas));
		
		for (int i = 1; i < mas.length; i += 2) {
			mas[i] = 0;
		}

		System.out.println("сжатый массив " + Arrays.toString(mas));

	}

}
