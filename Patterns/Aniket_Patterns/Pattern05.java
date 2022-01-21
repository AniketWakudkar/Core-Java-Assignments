//  5 4 3 2 1
//	5 4 3 2
//	5 4 3
//	5 4
//	5
package com.Aniket_Patterns;

import java.util.Scanner;

public class Pattern05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows: ");
		int range = sc.nextInt();

		for (int row = 1 ; row<=range ; row++){
			for (int col = range ; col>=row; col--){
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
}
