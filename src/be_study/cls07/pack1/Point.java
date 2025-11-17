package be_study.cls07.pack1;

public class Point {
	int math;
	public int eng;
	private int lang;
	
//	private Point() {}생성자에게도 접근자를 사용
	 public Point(int math, int eng, int lang){
		this.math = math;
		this.eng = eng;
		this.lang =lang;
	}
	
	void methood1() {
		System.out.println("methood1");
	}
	public void methood2() {//일반적으로 사용
		System.out.println("methood2");
	}
	private void methood3() {//일반적으로 사용
		System.out.println("methood3");
	}
	//Setter 저장용
	//setXXX 로직을 부여할 수 있어서 쓴다. 검증을 할 수도 있다. 
	public void setMath(int math) {
		this.math = math;
	}
	public void seteng(int eng) {// 외부에서 접근이 가능한다.
		this.eng = eng;
	//메소드 로직 코드 등 작성가능
//		0~100 이 아닌 잘못된 숫자를 입력하면
//		이건 점수입력상수로 0점 처리함
		if(eng>= 0 && eng <=100) {//정상범위
			this.eng = eng;
		}else {
			this.eng = 0;
		}
}
	public void setlang(int lang) {
		this.lang = lang;
	}
	public void setlang(int lang) {
		this.lang = lang;
	}
	public int getMath() {
		return this.math;
			}
	public int getMath() {
		//return
		//1000점으로
		//
		return this.math*10;
			}
}
