//  1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5 5 5 5

package com.Aniket_Patterns;
import java.util.Scanner;
public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row: ");
        int range = sc.nextInt();
        for(int row = 1 ; row<=range ; row++ ){
            for(int col = 1 ; col<=row ; col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
