package com.lec.java.array10;

import java.util.Arrays;

/* Enhanced for (향상된 for) 문
 	
 	for (배열타입 변수 : 배열이름) { ... }
 	
 */
public class Array10Main {

	public static void main(String[] args) {
		System.out.println("Enhanced for (향상된 for) 문");
		
		int[] arr = {11, 22, 33, 44, 55};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("1차원 배열 빠른 for문");
		
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("2차원 배열 빠른 for문");
		
		System.out.println();
		System.out.println("2차원 배열에서 enhanced for");
		int[][] array = {
				{1, 2},
				{3, 4, 5, 6},
				{7, 8, 9}
		};
		
		for(int[] row : array) {
			for(int x : row) {
				System.out.print(x+" ");				
			}
			System.out.println();
		}
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class Array10Main









