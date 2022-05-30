import java.util.Scanner;
class worker
{
	String name;
	double basic;
	public worker(String n,double b)
	{
		name = n;
		basic = b;
	}
	public void display()
	{
		System.out.println("name = "+ name);
		System.out.println("basic pay = " + basic);
		}
}
class wages extends worker
{
	int hrs;
	double rate;
		public wages(String n,double b,int h,double r)
		{
			super(n,b);
			hrs = h;
			rate = r;
		}
		public double overtime()
		{
			return hrs*rate;
		}
		public void display()
		{
			double wage = overtime()+ basic;
			System.out.println("hours = "+hrs);
			System.out.println("rate = "+rate);
			System.out.println("wage = "+wage);
			super.display();
		}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
                System.out.println("enter the name of worker");
                String name = sc.nextLine();
                System.out.println("enter the basic pay of the worker");
                double basic = sc.nextDouble();
		System.out.println("enter working hours");
		int hrs = sc.nextInt();
		System.out.println("enter rate per hour");
		double rate = sc.nextDouble();
         	wages obj = new wages(name,basic,hrs,rate);
		obj.display();
	}
}





				


















