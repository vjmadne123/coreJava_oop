package Scanner1;

import java.util.Scanner;

public class Sample {
	public static int sum(int[] num){
		int  sum=0;
	  for(int i=0; i<num.length;i++)
	  {
		  sum=sum+num[i];
	  }
			return sum;
			
			
		}
	

	public static void main(String[] args) {
		
		
		//@SuppressWarnings("resource")
		//@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		
		System.out.println("enter a size :-");
		int n=scn.nextInt();
		int[] num=new int[n];
		System.out.println("enter array element:-");
		for(int i=0; i<=n-1; i++)
		{
			num[i]=scn.nextInt();
		}
		System.out.println(sum(num));
		
	}

}
