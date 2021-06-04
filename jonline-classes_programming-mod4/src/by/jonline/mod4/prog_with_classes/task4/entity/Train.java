package by.jonline.mod4.prog_with_classes.task4.entity;

import java.util.Calendar;

public class Train { // java bean

	private String destinanionStation;
	private int trainNumber;
	private Calendar departureTime;

	public Train() {

	}

	public Train(String destinanionStation, int trainNumber) {
		this.destinanionStation = destinanionStation;
		this.trainNumber = trainNumber;
	}

	public Train(String destinanionStation, int trainNumber, Calendar departureTime) {
		this.destinanionStation = destinanionStation;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestinanionStation() {
		return destinanionStation;
	}

	public void setDestinanionStation(String destinanionStation) {
		this.destinanionStation = destinanionStation;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Calendar getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Calendar departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinanionStation == null) ? 0 : destinanionStation.hashCode());
		result = prime * result + trainNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinanionStation == null) {
			if (other.destinanionStation != null)
				return false;
		} else if (!destinanionStation.equals(other.destinanionStation))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destinanionStation=" + destinanionStation + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

}
