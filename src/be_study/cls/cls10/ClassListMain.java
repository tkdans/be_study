package be_study.cls.cls10;

import java.util.ArrayList;

import be_study.cls.cls09.Temp;

public class ClassListMain {

	public static void main(String[] args) {
		
		Temp t1 = new Temp();
		
		Temp[] tArr = new Temp[3];
		tArr[0]= new Temp();
		tArr[1]= new Temp();
		tArr[2]= new Temp();
	
	ArrayList<Temp> tlist = new ArrayList<Temp>();//초기화
	tlist.add(new Temp());
	tlist.add(new Temp());
	tlist.add(new Temp());
	tlist.add(new Temp());
	
	for(int i =0; i<tlist.size(); i++) {// tlist의 값을 저장
		System.out.print(tlist.get(i).num+" ");
		//              (Temp       )
		tlist.get(i).method();
	}
	System.out.println();
	for(Temp t : tlist) {// t의 tlist값이 존재하므로 t로 대체
		System.out.print(t.num+" ");
		//              
		t.method();
	}
	System.out.println();
	
	printList(tlist);
	ArrayList<Temp> returnList = generateList();
	printList(returnList);
}
	public static void printList (ArrayList<Temp>tlist) {
		System.out.println("------------");
		for(Temp t : tlist) {
			System.out.print(t.num+"  ");
			t.method();
		}
		System.out.println();
	}
	public static ArrayList<Temp> generateList(){
			ArrayList<Temp>list = new ArrayList<Temp>();
			list.add(new Temp());
			Temp t1 = new Temp();
			list.add(t1);
			//		return null;//리턴타입에 들어갈 수 있는 타입을 가지고 있어야 한다.
			return list;
	}
}
