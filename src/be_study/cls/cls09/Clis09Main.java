package be_study.cls.cls09;

public class Clis09Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10;
		int n2 = 20;
		int n3 = 30;
		
		int[] nArr = {10,20,30};
		int[] nArr1 = {n1,n2,n3};
		int[] nArr2 = new int [5];
		nArr2[3] = 100;
		
		for (int i=0; i<nArr.length; i++ ) {
			System.out.println(nArr[i]+" ");
			
		}
		System.out.println();
		
		for(int n : nArr2) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		System.out.println(methodA(n2));
		
		methodB(nArr);
		methodB(nArr2);
		int [] cArr = methodC(null);
//		methodC(300)
		methodB(cArr);
		
		System.out.println("--------------");
		Temp t1 = new Temp();
		Temp t2 = new Temp();
		Temp t3 = new Temp();
		Temp[]  tArr = {new Temp(),new Temp(),new Temp()};// new Temp-->객체
		Temp[]  tArr1 = {t1,t2,t3};
		Temp[]  tArr2 = new Temp[5];// 배열 5개 공간만 있음
		tArr2[3] = new Temp(); //배열 5개 중 3번 배열에 temp 클라스를 잆력()
		// null null null new Temp() null
		//nullPointerE
		for(int i=0; i<tArr.length; i++) {
			System.out.println(tArr[i].num);
			tArr[i].method();
		}
		System.out.println();
		for(Temp t : tArr1) {
			
				System.out.print(t.num);
				t.method();
		}
		System.out.println();
		for(Temp t : tArr1) {
			
				System.out.print(t.num);
				t.method();
		}
	}//메소드
	public static int methodA(int n) {
		return n + 10;
	}
	public static void methodB(int[]arr) {
		for (int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]+" ");
	}
		System.out.println();
}
	// int 배열을 리턴하는 타입의 형태가 동일할 뿐만아니라 매개변수까지 동일해야한다.
	public static int[] methodC(int []arr) {
		int [] ar = {5,4,3,2,1};
		return ar;
	}
	public static void methodD(Temp t) {// 단일 temp를 넘겨준다
		System.out.println(t.num);
		t.method();
	}
	public static void methodE(Temp []) {
		System.out.println(t.num);
		t.method();
	}
}

