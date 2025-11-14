package be_study.quiz26;

public class Monitor {
	//필드 변수(속성)
	String make;//제조회사
	int inch;//인치
	int price;//가격
	String color;//색상
	int xpixel;
	int ypixel;
	//생성자
//	Monitor(){}
	Monitor(String make,int inch,int price){
		this.make = make;
		this.inch = inch;
		this.price = price;
		this.color = null;
		this.xpixel = xpixel;
		this.ypixel = ypixel;
	}
//	Monitor(String make,int inch,int price,String color,int xpixel,int ypixel){
//		make = make;
//		inch = inch;
//		price = price;
//		color = color;
//		xpixel = xpixel;
//		ypixel = ypixel;
//	}
	//매소드
//	void setX {
//	void setY {
	void setXY(int x, int y) {
		this.xpixel = x;
		this.ypixel = y;
	}
	void setColor(String color) {
		this.color = color;
	}
	void printInfo() {
		System.out.println("모니터의 정보를 출력합니다");
		System.out.println(make+" "+inch+" "+price+" "+color+" "+xpixel+" "+ypixel+"");
//		System.out.printf("제조사:%s %d인치 모니터 가격:%d원 색상:%s 해상도: %d*%"d\n", make,inch,price,color,xpixel,ypixel)
	}
	
	void setColorXpixelYpixel(String _color,int _xpixel,int _ypixel) {
		this.color =  _color;
		this.xpixel = _xpixel;
		this.ypixel =  _ypixel;
	}
	//전원을 켜는 기능 (메소드)
	void powerOn() {
		System.out.println("전원이 켜졌습니다");
		}
	//입금된 금액을 리턴하는 기능
	int priceUp(int p) {// inputPrice 금액을 받아줄 매개변수가 필요
		this.price = p+this.price;// 매개변수로 가격인상 처리
		return this.price;//인상된 최종금액 반환
	}
	
}
