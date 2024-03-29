package com.lec.java.method03;

import java.util.Scanner;

/* 메소드 연습
 * 국어, 영어, 수학 점수를 입력 받아서
 * 총점, 평균, 학점을 출력하는 프로그램
 * 
 * 총점, 평균, 학점을 구하는 각각의 메소드들을 작성하여 프로그램 완성하기
 * 
 *  [입력예]
 *  78 98 57
 *  
 *  [출력예]
 *  총점: 233
 *  평균: 77.66666666666667
 *  학점: C
 */
public class Method03Main {
	
	public static void main(String[] args) {
		System.out.println("메소드 연습");

		// 국어, 영어, 수학 점수를 위한 int 변수를 선언
		int korean, english, math;
		
		// 키보드를 통해서 점수를 입력 받고 저장
		Scanner sc = new Scanner(System.in);

		korean = sc.nextInt();
		english = sc.nextInt();
		math = sc.nextInt();
		
		sc.close();
		
		// calcTotal() 메소드를 정의+호출 하여 총점 계산하고 출력
		int calcTot = calcTotal(korean, english, math);
		System.out.println(calcTot);
		
		
		// calcAvg() 메소드를 정의+호출 하여 평균 계산하고 출력
		double calcAv = calcAvg(calcTot);
		System.out.println(calcAv);
		
		
		// calcGrade() 메소드를 정의+호출 하여 학점(A, B, C, D, F)을 출력
		// 평균 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 60 이상이면 D
		// 나머지는 F
		char calcGra = calcGrade(calcAv);
		System.out.println(calcGra);
		
		// 메소드의 매개변수에 다른 메소드의 리턴값을 바로 전달가능.
		// 위 코드는 아래와 같이 수행 가능.
		//							calcTotal(korean, english, math)
		//                                             ↓
		//                                 calcAvg(         )
		//                                             ↓
		//                              calcGrade(            )
		//                                        ↓   
		//                        println(                     )
		System.out.println("학점: " + calcGrade(calcAvg(calcTotal(korean, english, math))));
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

	// calcTotal
	// 기능: 국어, 영어, 수학 점수를 입력 받아서 총점을 리턴하는 메소드
	// return: int
	// method name: calcTotal
	// arguments:
	//   1) int kor: 국어 점수
	//   2) int eng: 영어 점수
	//   3) int math: 수학 점수
	public static int calcTotal(int kor, int eng, int math) {
		int result;
		
		result = kor+eng+math;
		
		return result;
	}
	
	// calcAvg
	// 기능: 총점을 입력받아서 평균을 리턴하는 메소드
	// return: double
	// method name: calcAvg
	// arguments: int total - 총점
	public static double calcAvg(int total) {
		double result;
		
		result = (double)total/3;
		
		return result;
	}
	
	
	// calcGrade
	// 기능: 평균을 받아서 등급을 리턴하는 메소드
	//      평균 90 이상이면 'A', 80 이상이면 'B', 70 이상이면 'C', 60 이상이면 'D'
	//      나머지는 'F' 리턴
	// return: char
	// method name: calcGrade
	// arguments: double avg - 평균
	public static char calcGrade(double avg) {
		char result;
		
		if(avg>=90) {
			return 'A';
		} else if (avg >= 80) {
			return 'B';
		} else if(avg >= 70) {
			return 'C';
		} else if(avg >=60) {
			return 'D';
		} else {
			return 'F';	
		}
	}
	
	
	
} // end class








