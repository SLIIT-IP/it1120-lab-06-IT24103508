import java.util.Scanner;
public class IT24103508Lab6Q2C{
public static void main(String[]args){
	int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,sum;
	double avg;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter 10 numbers :");
		System.out.print("Enter number 1 :");
		n1=input.nextInt();
		System.out.print("Enter number 2 :");
		n2=input.nextInt();
		System.out.print("Enter number 3 :");
		n3=input.nextInt();
		System.out.print("Enter number 4 :");
		n4=input.nextInt();
		System.out.print("Enter number 5 :");
		n5=input.nextInt();
		System.out.print("Enter number 6 :");
		n6=input.nextInt();
		System.out.print("Enter number 7 :");
		n7=input.nextInt();
		System.out.print("Enter number 8 :");
		n8=input.nextInt();
		System.out.print("Enter number 9 :");
		n9=input.nextInt();
		System.out.print("Enter number 10 :");
		n10=input.nextInt();
		System.out.println("The numbers you entered are: "+n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6+" "+n7+" "+n8+" "+n9+" "+n10);
		sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
		System.out.println("Sum of the numbers: "+sum);
		avg=sum/10;
		System.out.println("Average of the numbers: "+avg);
		
	}
}