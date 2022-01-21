
//        5 4 3 2 1
//        4 3 2 1
//        3 2 1
//        2 1
//        1

package com.Aniket_Patterns;

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows: ");
        int range = sc.nextInt();

        for ( int row =range ; row>= 1;row--){
            for (int col =row ; col>=1 ; col--){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
