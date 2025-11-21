package be_study.inherit.inherit03;

public class Mike {
//마이크
	String type;
	String model;
	int price;

	public void volumUp() {
		System.out.println("Mike volumeUp()");
	}
	public void check() {
		System.out.println("기능체크");
	}
	
	public final void noMethod() {
		System.out.println("Mike volumeUp()");
	}
	// 여러기능 매소드

}
