package be_study.quiz26;

public class MonitorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monitor m1 = new Monitor("삼성",27,150000);
		Monitor m2 = new Monitor("LG",32,330000);
		m1.setColorXpixelYpixel("검은색", 1080, 780);//메소드로 처리하는것이 안정적이다
		m2.setColorXpixelYpixel("흰색", 4096, 2048);
		m1.printInfo();
		m2.printInfo();
		int returnPrice = m1.priceUp(70000); //7만원을 인상
		m2.priceUp(70000);
		System.out.println("인상된 최종 금액: "+returnPrice);
		m2.printInfo();
	}

}
