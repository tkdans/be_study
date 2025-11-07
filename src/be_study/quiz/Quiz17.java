package be_study.quiz;

public class Quiz17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[5][5];
		
		arr[0][0] = 0;
        arr[0][1] = 1;
        arr[0][2] = 2;
        arr[0][3] = 3;
        arr[0][4] = 4;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[0][i] + " ");
        }
        
        System.out.println();

        arr = new int[5][5];
        for(int i =0; i<5; i++)
        	arr[0][i]=i;
//        arr[0][0]=1;
//        arr[0][1]=2;
//        arr[0][2]=2;
//        arr[0][3]=2;
//        arr[0][4]=2;
//        arr[1][0]=3;
//        arr[1][1]=1;
//        arr[1][2]=2;
//        arr[1][3]=2;
//        arr[1][4]=2;
        

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[0][i] + " ");
        }
        }
		
	}


