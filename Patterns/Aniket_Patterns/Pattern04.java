//  5 5 5 5 5
//	4 4 4 4
//	3 3 3
//	2 2
//	1
package com.Aniket_Patterns;
import java.util.Scanner;
public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows: ");
        int range = sc.nextInt();
        for (int row =range; row>=1 ; row-- )
        {
            for(int col = 1; col<=row ; col++)
            {
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
}
