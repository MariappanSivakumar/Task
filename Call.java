class Parent
{
	public void print(Parent p)
	{
		System.out.println("Parent class is called");
		p.println();
	}
}
class Child extends Parent
{
	public void println()
	{
		System.out.println("Child class is called");
	}
}
class Call extends Child
{
	public static void main(String ar[])
	{
		//   >>>>>>>  One Way Of Solving      <<<
		Call c=new Call();
		c.print((Child)c);
	}
}
