//  1
//	1 2
//	1 2 3
//	1 2 3 4
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
package com.Aniket_Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int range = sc.nextInt();

        for ( int row = 1 ; row<= range ; row++){
            for (int col =1 ; col<=row ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
        for(int row = range-1 ; row>=1 ; row--){
            for (int col = 1 ; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
