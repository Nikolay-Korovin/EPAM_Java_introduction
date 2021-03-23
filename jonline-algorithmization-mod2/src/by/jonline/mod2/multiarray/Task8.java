package by.jonline.mod2.multiarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры

public class Task8 {

	public static void main(String[] args) {
		int frstColumn = 0;
		int scndColumn = 0;
		int tempNum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int array[][] = { { 4, 2, 3, 1 },
						  { 4, 1, 2, 9 },
						  { 0, 8, 1, 7 },
						  { 1, 0, 3, 2 } };
		
		for(int i = 0; i < array.length;i ++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
			
		}


		System.out.println("введите номер первого столбца от 0-3 >> ");

		try {
			frstColumn = Integer.parseInt(reader.readLine());
			if (frstColumn < 0) {
				System.out.println("От 0-3 пожалуйста");
				return;
			}
		} catch (NumberFormatException e) {
			System.out.println("Введите целое положительное число");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("введите номер второго столбца от 0-3 кроме " + frstColumn + " >> ");

		try {
			scndColumn = Integer.parseInt(reader.readLine());
			if (scndColumn < 0 | scndColumn == frstColumn) {
				System.out.println("от 0-3 кроме " + frstColumn + " >> ");
				return;
			}
			reader.close();
		} catch (NumberFormatException e) {
			System.out.println("Введите целое положительное число");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < array.length; i++) {
			tempNum = array[i][frstColumn];
			array[i][frstColumn] = array[i][scndColumn];
			array[i][scndColumn] = tempNum;
		}
		
		for(int i = 0; i < array.length;i ++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
			
		}

	}

}
