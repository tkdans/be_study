package be_study.quiz30;

public class SalaryManMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryMan sm1 = new SalaryMan();
		sm1.getAnnualGross();
		
		SalaryMan sm2 = new SalaryMan();
		sm2.getAnnualGross();
		
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
	}

}
