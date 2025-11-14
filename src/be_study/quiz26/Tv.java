package be_study.quiz26;

public class Tv {
	//필드
	String make; //company 제조사
	int year;// 제조년도 몇년형
	int inch; // 몇 인치?
	//생성자
	Tv(String make,int year,int inch){
		this.make = make;
		this.inch = inch ;
		this.year = year;
	}
	
	//매소드
	void show() {
		System.out.println(make + "제품 "+year+"년형 "+inch+"인치 TV");
		System.out.printf("%s 제품 %d 년형 %d인치 TV\n",make,year,inch);
	}
}

