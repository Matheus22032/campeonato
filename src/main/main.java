package main;

import modelo.*;

public class main {

	public static void main(String[] args) {
		Time time1 = new Time("Corinthians");
		Time time2 = new Time("Palmeiras");
		Championship paulistao = new Championship();
		
		paulistao.confront(time1, time2);
	}

	

}
