import java.util.Scanner;
class product
{
        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter a number");
                int a = sc.nextInt();
                System.out.println("enter another number");
                int b = sc.nextInt();
                int p = a*b;
                if(p == 0)
		{
			System.out.println("one number is zero. Try again looser");
		}
		else
		{
			System.out.println("product = " + p);
		}
        }
}

