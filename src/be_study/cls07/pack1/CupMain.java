package be_study.cls07.pack1;

import java.util.Scanner;

import be_study.cls07.pack2.Cup;

public class CupMain {
// import java.util.Scanner; // 다른 
	private static final String Cup = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c1 =new Cup();
		
		Scanner scanner = new Scanner(System.in);
		
		Cup c5 = new Cup();
		//패키지 정보를 붙여서 쓴다. 
		//import를 통해서  패키지를 선정할 수 있다, 
		//같은이름의 다른 패키지의 경우에는 풀네임(import)을 써 줘야 한다.
		be_study.cls07.pack2.Cup c6 = new be_study.cls07.pack2. cup();
		c5.method();
		c6.method();
	}

}
