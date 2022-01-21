//  1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
package com.Aniket_Patterns;

import java.util.Scanner;

public class Pattern03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of row: ");
        int range=sc.nextInt();
        for(int row = range ; row >= 1 ; row--){
            for (int col = 1 ; col <= row ; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
