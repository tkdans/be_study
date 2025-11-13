package be_study.cls.cls02;

public class PhoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Phone p1 = new Phone();// 최소 모델명을 만들어 가자, 빨간 줄은 기본생성자가 없다.
		//생성자의 타입의 순서, 갯수에 따라 여러개 선언
		Phone p1 = new Phone("아이폰12");
		Phone p2 = new Phone("갤럭시12");
		Phone p3 = new Phone("갤럭시10", 900000);
		Phone p4 = new Phone(900000,"아이폰6");
		Phone p5 = new Phone(900000,"아이폰6",40000);
	}

}
