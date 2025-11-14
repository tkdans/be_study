package be_study.cls05;

public class GalaxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("정적:"+ Galaxy.madeBy);
		Galaxy.showMadeBy();//태어나기 전에 쓸 수 있다.
		Galaxy g1 = new Galaxy();
		g1.owner = "엄마";
		g1.model = "갤럭시10";
		System.out.println(g1.madeBy);// Galaxy.madeBy
		g1.showInfo();
		Galaxy g2 = new Galaxy();
		g2.owner = "아빠";
		g2.model = "갤럭시24";
		g2.showInfo();
		Galaxy.showMadeBy();
		System.out.println(Math.random());//new Math
		Integer.parseInt(null);// new Integer();
//		Scanner.scanner = new Scanner(System);
		System.out.println(3*3*3.14);
		System.out.println(3*3*Math.PI);
			
	}

}
