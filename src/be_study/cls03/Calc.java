package be_study.cls03;

public class Calc {

	//필드
	
	//생성자
	//매소드
	/* 리턴 타입 메소드명
	 * 
	 */
	//계산기 전원 켜기 --> 리턴 X 매개변수 X
	void powerOn () {
		System.out.println("power On");
	}
	//소유자 이름 등록 +리턴X --> 매개변수0(이름 전달)
	void setOwner(String name){
	 System.out.println(name+ "님의 계산기로 등록되었습니다.");
 }
	//계산기 계산 수행 -> 리턴 O 매개변수 O
	int sum(int n1, int n2) {
		int result = n1+n2;
		return result; //int타입을 담을수 있어야 한다.
	}
	//
	double divide (int x, int y){
		double result = (double) x/y;
		return result;// 문법적으로 담을 수 있느냐, 정수형--> 실수형 담을 수 있다
	}
	//리턴 O 매개변수 X
	//배터리 잔여량 얼마나?
	int checkBattery() {
		return 80;
	}
	//제조사 어디냐
	String madeByInfo() {
		return"카시오";
	}
}
