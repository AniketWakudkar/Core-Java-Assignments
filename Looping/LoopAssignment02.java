//Assignemnt 2 (For loop )
//sum of the numbers from 1 to n
   
  import java.util.Scanner;
  class LoopAssignment02{
  	public static void main(String[] args)
          {
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the value of n: ");

	int n=sc.nextInt(); 
	int sum=0;
	
	//Using for loop=======================
                /*  for(int i=1;i<=n;i++){
		 sum=sum+i;
 	   }*/
       
            	//using while loop=======================
	/*int i=1;
 	while(i<=n){
		
		sum=sum+i;
		i++;
                    }*/

	//using do while loop======================
	int i=1;
	do
	{
		sum=sum+i;
		i++;
	}
	while(i<=n);
 	System.out.println("sum of  1 to "+n+" is "+ sum);
           }
}
