package be_study.inherit.inherit07;

//public class Drive extends Object{//상속받고 있다. 다른 상속을 못 받는다.
public class Drive {

	public void diveBus(Bus bus) {
		bus.run();
	}

	public void diveTaxi(Taxi taxi) {
		taxi.run();
	}

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

	public String toString() {
	// XX 매소드 재정의시 부모에 정의된 접근제한자보다 좁은 범위로 줄일 수 있다ㅣ
		return "이것은 driver입니다.";
	}
}
