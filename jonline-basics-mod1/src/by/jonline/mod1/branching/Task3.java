package by.jonline.mod1.branching;

//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������. 

public class Task3 {

	public static void main(String[] args) {

		int x1 = 4;
		int y1 = 4;
		int x2 = 2;
		int y2 = 2;
		int x3 = 0;
		int y3 = 0;
		int S;

		S = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2; //���� ����� ������� ������������(����� �������� ������� �� ����, ��� ���������� � ��� �)
		if (S == 0) {										     
			System.out.println("����� �� ����� �����");
		} else
			System.out.println("����� �� �� ����� �����");
	}

}

