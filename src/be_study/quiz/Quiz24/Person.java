package be_study.quiz.Quiz24;

public class Person {

	//필드
	String name; // 이름
	String gender; //성별
//	int gender; 1남,
	int age; //나이
	/*int height*/ double height; //키
	/*int weight;*/ double weight; //무게
	String job;//직업
	String bloodType;//혈액형
	String healthState;// 건강상태 "매무좋음"
	boolean sleep;
	
	
	//생성자
	Person(String name,String gender,int age,double height,double weight,String job,String blood,String healthState,boolean sleep){
		
		this.name =name;
		this.gender = gender;
		this.age =age ;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = blood;
		this.healthState = healthState;
		this.sleep = sleep;
	}
	
	//매소드
}
