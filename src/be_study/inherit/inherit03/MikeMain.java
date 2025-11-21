package be_study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		Mike m1 = new Mike();
		m1.volumUp();

		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumUp();
		WirelessMike Wm1 = new WirelessMike();
		Wm1.volumUp();
	}

}
