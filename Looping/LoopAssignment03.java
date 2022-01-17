 // Assignment 3 - program to display only even numbers from 1 to n

import java.util.Scanner;
class LoopAssignment03{
       public static void main(String [] ar){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of  n: ");
	int n=sc.nextInt();


	for(int i=1;i<=n;i++){
	if(i%2==0)
	System.out.print(i+" ");
	}
         }
}