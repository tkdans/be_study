package be_study.refer;

public class Arr03 {

	public static void main(String[] args) {
		//배열 int
		int[] arr1 = {1,2,3};
		
		 System.out.println(arr1[0]==arr1[2]);
		 //						1		3
		 //						int		int
		 
		 
		 String[] arr2  = {"A","B","C"};
		 System.out.println(arr2[0]==arr2[2]);
		 //					주소			주소
		//					"A"			"C"
		 //					string		string
		 System.out.println(arr2[0].equals(arr2[2]));

	}

}
