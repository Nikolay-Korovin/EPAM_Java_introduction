package by.jonline.mod1.linear;

//��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
//����������� ����������� �������, � false � � ��������� ������: 

public class Task6 {

	public static void main(String[] args) {

		double x = 0;
		double y = -1;

		if ((x >= 0 & x <= 2) & (y >= 0 & y <= 4)) 
			System.out.println("true");
		else if ((x >= 0 & x <= 4) & (y <= 0 & y >= -3)) 
			System.out.println("true");
		else if ((x <= 0 & x >= -4) & (y <= 0 & y >= -3)) 
			System.out.println("true");
		else if ((x <= 0 & x >= -4) & (y >= 0 & y <= 4)) 
			System.out.println("true");
		else
			System.out.println("false");

	}

}
