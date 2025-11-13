package be_study.quiz.Quiz24;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person ("박상문","남자",44,174,82,"무직","O형","건강",true );
		Person p2 = new Person1();
		p1.name = "내이름";
		p1.gender = "남";
		p1.age = 24;
		p1.height =194;
		p1.weight = 101.9;
		p1.job = "건물주";
		p1.bloodType = "A";
		p1.healthState = "매우좋음";
		p1.sleep = false;
		System.out.println(p1.name);
		System.out.println(p1.gender);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.weight);
		System.out.println(p1.job);
		
		Person p3 = new Person3("너이름","여자",32,153);
	}

}
