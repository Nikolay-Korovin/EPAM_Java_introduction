package by.jonline.mod4.prog_with_classes.task4.main;

import java.util.GregorianCalendar;
import java.util.List;

import by.jonline.mod4.prog_with_classes.task4.entity.Depo;
import by.jonline.mod4.prog_with_classes.task4.entity.Train;
import by.jonline.mod4.prog_with_classes.task4.logic.TrainLogic;
import by.jonline.mod4.prog_with_classes.task4.view.TrainView;

public class Main {
	public static void main(String[] args) {

		Depo depo = new Depo();
		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();

		depo.addTrain(new Train("Minsk", 14881, new GregorianCalendar(2021, 1, 1, 13, 0)));
		depo.addTrain(new Train("Moscow", 24114, new GregorianCalendar(2021, 2, 10, 13, 0)));
		depo.addTrain(new Train("Greece", 11442, new GregorianCalendar(2021, 3, 11, 13, 0)));
		depo.addTrain(new Train("Kiev", 12488, new GregorianCalendar(2021, 4, 3, 13, 0)));
		depo.addTrain(new Train("Saint Petersburg", 42069, new GregorianCalendar(2021, 5, 3, 13, 0)));
		
		List<Train> sorted;
		sorted = logic.sortByNumber(depo.getTrains());
		view.print("By number", sorted);
		
		Train train;
		train = logic.findByNumber(42069, depo.getTrains());
		view.print(train);

	}

}
