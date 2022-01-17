// Assignment 5 sum of the even numbers and odd numbers from 1 to n

import java.util.Scanner;
class LoopAssignment05{
       public static void main(String [] ar){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value of  n: ");
	int n=sc.nextInt();
int soe=0;
int soo=0;


	for(int i=1;i<=n;i++){
	if(i%2==0){
                  soe=soe+i;
                  }else if(i%2!=0)
	soo=soo+i;
	
	}
	System.out.print("Sum of even numbers and  odd numbers from 1 to "+n+" is "+soe+" and "+soo+" respectively.");
         }
}