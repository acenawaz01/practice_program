import java.util.Scanner;
class sub
{
        public static void main(String args[])
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("enter a number");
                int a = sc.nextInt();
                System.out.println("enter another number");
                int b = sc.nextInt();
                int sub = a-b;
                System.out.println("subtraction =" + sub);
        }
}

