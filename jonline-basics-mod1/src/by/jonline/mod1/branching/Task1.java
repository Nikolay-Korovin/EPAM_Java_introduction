package by.jonline.mod1.branching;

import java.io.IOException;

//���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� ��
//�� �������������.

public class Task1 {

	public static void main(String[] args) throws IOException {

		int x = 90;
		int y = 60;

		if (x == 90 ^ y == 90 ^ (x + y) == 90) {
			System.out.println("����������� ���������� � �� �������������");
		} else if ((x + y) < 180) {
			System.out.println("����������� ����������");
		} else
			System.out.println("������������ �� ����������");

	}

}
