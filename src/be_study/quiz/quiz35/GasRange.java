package be_study.quiz.quiz35;

public class GasRange {
	int fireball;
	String brand;
	int price;
	boolean fire;
	int firecontrol;
	
	public void fireOn() {
		fire = true;
	}
	public void fireOff() {
		fire = false;
	}
	public void fireUP() {
		firecontrol++;
	}
	public void fireDown() {
		firecontrol--;
	}

}
