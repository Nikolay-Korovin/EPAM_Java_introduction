package by.jonline.mod4.prog_with_classes.task4.logic;

import java.util.ArrayList;
import java.util.List;
import by.jonline.mod4.prog_with_classes.task4.entity.Train;

public class TrainLogic {

	public List<Train> sortByNumber(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size(); i++) {
			// сортировка по номеру поезда(trainNumber)
		}

		return sortTrains;
	}

	public Train findByNumber(int numberToFind, List<Train> trains) {
		Train train = null;

		for (int i = 0; i < trains.size(); i++) {
			// поиск по номеру и вернуть нужный Train
		}

		return train;

	}

	public List<Train> sortByDestination(List<Train> trains) {
		List<Train> sortTrains = new ArrayList<Train>();
		sortTrains.addAll(trains);

		for (int i = 0; i < sortTrains.size(); i++) {
			// написать сортировку по пункту назначения(trainNumber)
			//поезда с одинаковыми пунктами
			//назначения должны быть упорядочены по времени отправления
		}

		return sortTrains;
	}

}
