package com.Aniket_Patterns;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int l=sc.nextInt();
       pattern01(l);
        System.out.println();
       pattern02(l);
        System.out.println();
        pattern03(l);
        System.out.println();
    }

    /*   * * * *
         * * * *
         * * * *
         * * * *
     */

    public static void pattern01(int l){
        for(int row=1;row<=l;row++){
            for(int col=1;col<=l;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*   * * * *
           * * * *
             * * * *
               * * * *
     */
    public static void pattern02(int l){
        for(int row=1;row<=l;row++){
            for(int col=1;col<=l;col++){
                System.out.print("* ");
            }
            System.out.println();
            for(int s=1;s<=row;s++)
                System.out.print(" ");
        }

    }

    /*
          * * * *
          *     *
          *     *
          * * * *
     */

    public static void pattern03(int l){
        for(int row=1;row<=l;row++){
            for(int col=1;col<=l;col++){
                if(row==1 || row==l || col==1 || col==l)
                System.out.print(" * ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}
