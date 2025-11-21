package be_study.inherit.inherit03;

public class WirelessMike extends Mike {
//무선 마이크 is a 마이크
	// 메소드를 재정의(오버라이팅)
	public void volumUp() {
		System.out.println("BluetoothMike 재정의 volumeUp()");
	}
}
