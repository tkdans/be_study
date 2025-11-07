package be_study.quiz;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		// 배열에 값을 입력하는것
		for(int i =0; i<5; i++) {
			System.out.println("값을 입력해 주세요:");
			arr[i]=scanner.nextInt();	
			}
		//배열의 값을 출력하는것
		for(int j = 0; j<5; j++) {
				System.out.print(arr[j]);
		}
		
//		System.out.println("값을 입력해 주세요");
//		arr[0] = scanner.nextInt();
//		System.out.println("값을 입력해 주세요");
//		arr[1] = scanner.nextInt();
//		System.out.println("값을 입력해 주세요");
//		arr[2] = scanner.nextInt();
//		System.out.println("값을 입력해 주세요");
//		arr[3] = scanner.nextInt();
//		System.out.println("값을 입력해 주세요");
//		arr[4] = scanner.nextInt();
		
//		for(int i = 0; i<5; i++) {
//			System.out.print(arr[i]);
//		}

		
	}
}
