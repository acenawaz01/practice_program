import java.util.Scanner;
class all
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int a = sc.nextInt();
	 System.out.println("enter a number");
	int b = sc.nextInt();
	int sum = a+b;
	int m  = a*b;
	int d = a/b;
	 System.out.println("sum of the number is "+ sum);
	  System.out.println("multiplication of the number is"+ m);
	   System.out.println("quotient of the number is"+ d);
}
}
