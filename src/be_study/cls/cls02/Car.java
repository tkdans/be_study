package be_study.cls.cls02;

public class Car {
	//자동차르르 의미하는 설계도(클래스)
	
	
	
	//필드(속성 변수)
	String model; //모델명 기본값 null
	String color;// 차향색상 기본값 null
	int price;// 차 가격 기본값 0
	
	
	//생성자( 생성할때 초기화 할일 new 클래스명()
	// 생성자 만들지 않음, 자동으로 추가하는 기본생성자 , 없으면 안 만들어진다.
	Car(){//매개변수없음
		//기본생성자
		//객체 생성하면서 초기화 해야할 일 (*필드의 초기화 (필드변수에 값 세팅))
		System.out.println("Car() 기본생성자 호출됨");
		color = "green";
		model = null;
		price = 0;
		
	}
	Car(String _model){//매개변수, 스트링 객체를 요구 = "쏘나타" new Car("그랜져")
		System.out.println("Car(String _model) 생성자 호출됨");
		model= _model;
		// 이 생성자를 통해서 객체가 만들어지는 과정
		// model 필도변수에 매개변수 _model에 전달된 값을 저장하겠다.
	}
	//_model = "그랜저";// 사용 못 함 
	//매소드( 기본 동작)
	//매개변수 2개 변수 앞에 _를 쓴다. this
	Car(String _model, String _color){//new Car ("쏘랜토", "black");
		System.out.println("Car(String _model, String color) 생성자 호출됨");
		this.model = _model;//필드변수 = _model;//매개변수
		color = _color;
//		int n= 10;
//		n = n;
	}

}
