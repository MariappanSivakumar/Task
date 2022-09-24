abstract class Parent
{
	public void print()
	{
		System.out.println("Parent class is called");
		println();
	}
	abstract void println();
}
class Child extends Parent
{
	@Override 
	void println()
	{
		System.out.println("Child class is called");
	}
}
class CallA extends Child
{
	public static void main(String ar[])
	{
		//   >>>>>>>  Second Way Of Solving      <<<
		Call callObject=new Call();
		callObject.print();
	}
}
