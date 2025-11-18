package be_study.cls.cls10;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		
		//ArrayList 개념
		String[] sArr1 = new String[4];
		sArr1 [0] = "A";
		sArr1 [1] = "A";
		sArr1 [2] = "A";
		sArr1 [3] = "A";
//		sArr1 [4] = "A";
		
//		String[] sArr2 = new String[5];
//		for(int i = 0; i<sArr1.length; i++ )
//		
//			
			
			//ArrayList
			//ArrayList<저장할 타입> 변수명 = new ArrayList<저장할 타임>();
			System.out.println("-----------ArrayList----------");
			ArrayList<String> slist = new ArrayList<String>();
			slist.add("A");// List에 값 추가 .add
			slist.add("B");
			slist.add("C");
			slist.add("D");
			slist.add("E");
			slist.add("F");
			
			for(String s : slist) {
				System.out.print(s + " ");
				
			}System.out.println();
			
			for(int i = 0; i<slist.size(); i++) {
				//List의 특성 인덱스 위치의 값 접근 .get(index) arr[i]
				System.out.print(slist.get(i)+" ");
			}System.out.println();
			if(slist.contains("B"))//contains는 true,false로 
			System.out.println("contains결과가 true면 B가 이미 있다");
			else
				System.out.println("List의 B가 없다");
			if(slist.contains("G")== false) {//"G"가 없다면 
				slist.add("G");
			}
			for(int i = 0; i<slist.size();i++) {
				System.out.print(slist.get(i)+" ");
				
			}System.out.println();
			
			//arr[2] = "H";
			//list.get(2)??
			
			//list의 특정위치에 값을 저장 set
			slist.set(2, "H");
			for(int i = 0; i<slist.size(); i++) {
				//list의 특정 인덱스 위치의 값 접근  .get(index) arr[i]
				
			}
	}

}
