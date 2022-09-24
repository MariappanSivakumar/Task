class Parent
{
	public void print(Parent parentObject)
	{
		System.out.println("Parent class is called");
		paretObject.println();
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
		Call callObject=new Call();
		callObject.print((Child)callObject);
	}
}
