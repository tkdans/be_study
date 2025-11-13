package be_study.cls03;
public class CalcMain {

	public static void main(String[] args) {
		//계산기 생성
		Calc c1 = new Calc();
		c1.powerOn(); // 매소드 호출 (실행) 뒤에 괄호가 붙음 매개변수가 없는 매소드
		//c1.powerOn = true powerOn 이라는 필드변수가 있나보다~
		
		c1.setOwner("에드워드리");//setOwner 메소드 실행시 필요한 
		//name이라는 매개변수에 들어가게될 값을 전달하면서 호출
		
		Calc c2 = new Calc();
		c2.powerOn();
		c1.setOwner("김풍");// 리턴이 void이기 때문에 출력할 수 없다
		//int r = c2.setOwner("김풍"); 출력이 안됨
		int result1 = c2.sum(10,20);
		System.out.println(result1);
		System.out.println(c2.sum(50, 100));
		
		double result2 = c2.divide(30, 7);
		System.out.println(result2);
		
		int result3 = (int)c2.divide(30, 7);
		System.out.println(result3);
		int cb = c2.checkBattery();
		System.out.println("잔여배터리량 : " + cb);
		
		System.out.println("계산기 제조사 :"+ c2.madeByInfo());
	}

}
