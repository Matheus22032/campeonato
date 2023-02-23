package modelo;

public class Championship {
	
	public void confront(Time time1, Time time2) {
		time1.scoreGeneretor();
		time2.scoreGeneretor();
		if(time1.getScore() < time2.getScore()) {
			time2.setWin(true);
		}else if(time1.getScore() > time2.getScore()) {
			time1.setWin(true);
		}
			
	}
	
	public void winner(Time time1, Time time2) {
		
	}

}
