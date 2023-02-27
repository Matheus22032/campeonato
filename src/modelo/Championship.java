package modelo;

public class Championship {

	public void confront(Time time1, Time time2) {
		time1.scoreGeneretor();
		time2.scoreGeneretor();
		winner(time1, time2);
		validatedChampion(time1, time2);

	}

	public void winner(Time time1, Time time2) {
		if (time1.getScore() > time2.getScore()) {
			time1.setWin(true);
		} else if (time1.getScore() < time2.getScore()) {
			time2.setWin(true);
		}
	}

	public void validatedChampion(Time time1, Time time2) {
		if (time1.getWin()) {
			System.out.println(
					time1.getName() + " " + time1.getScore() + " x " + time2.getScore() + " " + time2.getName());
			System.out.println("Campeao: " + time1.getName());
		} else {
			System.out.println(
					time1.getName() + " " + time1.getScore() + " x " + time2.getScore() + " " + time2.getName());
			System.out.println("Campeao: " + time2.getName());
		}
	}

}
