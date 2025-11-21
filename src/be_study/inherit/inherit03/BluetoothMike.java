package be_study.inherit.inherit03;

public class BluetoothMike extends Mike {
//블루투스 마이크는 마이크다

	boolean isConnected;
	int battery;

	public void connect() {

	}

	// 메소드를 재정의(오버라이팅)
	public void volumUp() {
		System.out.println("BluetoothMike 재정의 volumeUp()");
	}// 오버로딩

	public void volumUp1(int V) {
		System.out.println("v만큼 volumeUp()");
	}
//public void	noMethod() {
	
}

