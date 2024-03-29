package com.lec.java.operator03;

/* 부호연산자(+, -) sign operator
 * 	+: 부호 연산자(수의 부호(양,음)가 바뀌지 않음)
 * 	-: 부호 연산자(수의 부호(양,음)가 바뀜)
 */
public class Operator03Main {

	public static void main(String[] args) {
		System.out.println("연산자 3 - 부호연산자(+, -) sign operator");

		int num1 = -10;
		int num2 = +num1;
		int num3 = -num1;

		System.out.println(num1 + " " + num2 + " " + num3); // -10 -10 10

		int num4 = 11;
		int num5 = -22;
		int num6 = num4 + -num5;

		System.out.println(num6); // 33

		int num7 = num4 - -num5; // -11
		System.out.println(num7);

		System.out.println("\n프로그램 종료");
	} // end main

} // end class
