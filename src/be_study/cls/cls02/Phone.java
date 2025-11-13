
package be_study.cls.cls02;

public class Phone {

	//필드
	String model;
	int price;
	int battery;
	
	
	//생성자
	// 기본생성자 Phone(){} 무슨핸드폰
	// 생성자를 여러개를 생성하는 것을 오버로딩
	Phone(String model){
		this(model,0,2500);
//		this.model = model;// this. 나자신
//		this.price = 0;
//		this.battery = 0;
		//재부팅
		//필름부착
		//알콜 소독
		//...
	}
	Phone(String model, int price){//String int 
		this.model = model;
		this.price = price;
		this.battery = 0;
		//재부팅
				//필름부착
				//알콜 소독
				//...
	}
	//Phone(String model, int battery){//String int 타입이 중복 중복으로 불가
		Phone(int battery, String model ){//순서를 바꾼다.
		this.model = model;
		this.battery = battery;
		//재부팅
		//필름부착
		//알콜 소독
		//...
	}

	Phone(String model, int price, int battery){
		this.model = model;
		this.price = price;
		this.battery = battery;
		//재부팅
		//필름부착
		//알콜 소독
		//...
	}
	Phone( int price, String model, int battery){// 순서를 바꾼다.
		this.model = model;
		this.price = price;
		this.battery = battery;
		//재부팅
		//필름부착
		//알콜 소독
		//...
	}
	//매소드
}
