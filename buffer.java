import java.io.*;
class buffer
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a numbe");
	String s = input.readLine();
	int a = Integer.parseInt(s);
	System.out.println(a);
}
}
