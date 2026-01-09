
package a;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;
public class a1 {

	public static void main(String[] args) {
		//10,20,30,40,56,83 숫자들이 총합과 평균구하기
		int[]score = new int[] {10,20,30,40,56,83};
		int sum=0;
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		double avg = (double) sum / score.length;

	    System.out.println("총합: " +sum);
	    System.out.printf("평균:%.2f" ,avg);
		//출력방식
	    int max= score[0];
	    int min =score[0];
	    for(int i=0; i<score.length; i++) {
	    	if( max <= score[i]) {max= score[i];}
	    	if(min >= score[i]) {min= score[i];}
	    	
	    }
	    System.out.println("최대값: " + max);
	    System.out.println("최소값: " + min);
	    

	    ArrayList<String>names = new ArrayList<>();
	    names.add("철수");
	    names.add("영희");
	    names.add("광수");
	    names.add("영탁");
	    names.add("도훈");
	    System.out.println(names);
	    
	    for(int i=0; i<names.size(); i++) {
	    	System.out.printf("%d 번: %s\n", i+1 ,names.get(i));
	    }
	 
	    
	    
	}

}
