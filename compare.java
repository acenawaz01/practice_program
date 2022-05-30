import java.util.Scanner;
class compare
{
        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter a number to compare");
                int a = sc.nextInt();
                System.out.println("enter another number to compare");
                int b = sc.nextInt();
		if(a>b)
		{
			System.out.println(a + "is greater than" + b);
		}
		else if(a<b)
		{	
                System.out.println(b + "greater than" + a);
		}
		else if (a == b)
		{
			System.out.println(a + "is equal to" + b);
		}
			
        }
}

