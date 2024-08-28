import java.util.Scanner;
public class IT24103508Lab6Q1{
public static void main(String[]args){
	double square,root,number;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number :");
	number=input.nextDouble();
	square=Math.pow(number,2);
	System.out.println("The Square of "+number+" is :"+square);
	root=Math.sqrt(number);
	System.out.println("The Square root of "+number+" is :"+root);
	}
}
	