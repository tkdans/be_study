package be_study.quiz.quiz35;

public class Icebox {
	String brand;
	int volume;
	int door;
	boolean power;
	int temperature;
	Icetrade Icetrade;

	public void powerOn() {
		power= true;
		
	}
	public void powerOff() {
		power= false;
	}
	public void temperatureUp() {
		temperature++;
	}

	public void temperatureDown() {
		temperature--;
	}
}
