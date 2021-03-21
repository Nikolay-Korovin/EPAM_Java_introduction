package by.jonline.mod1.linear;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

public class Task5 {

	public static void main(String[] args) {
		
		int sek = 36000;
		int hou = sek / 3600;
		int min = sek / 60;
		
		
		System.out.println(hou+"ч "+min+"мин "+sek+"сек.");

	}

}
