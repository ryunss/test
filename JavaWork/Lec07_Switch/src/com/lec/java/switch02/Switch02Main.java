package com.lec.java.switch02;

public class Switch02Main {

	public static void main(String[] args) {
		System.out.println("switch 연습");

		// 도전
		// switch ~ case 조건문을 사용해서
		// 짝수 이면 --> "짝수입니다"  출력
		// 홀수 이면 --> "홀수입니다"  출력

		int num = 98;
		
		int res = num%2;
		switch(res) {
		case 0:
			System.out.println("짝수입니다.");
			break;
		case 1:
			System.out.println("홀수입니다.");
			break;
		default:
			System.out.println("짝수도 홀수도 아니면 뭘까");
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class









