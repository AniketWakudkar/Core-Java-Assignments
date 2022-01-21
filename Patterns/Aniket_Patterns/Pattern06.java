//  1 1 1 1 1
//	2 2 2 2
//	3 3 3
//	4 4
//	5
package com.Aniket_Patterns;

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int range = sc.nextInt();

        for (int row = 1 ; row<=range ; row++){
            for (int col = row ; col<=range; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
