abstract class Parent
{
  abstract void println();
}  
class Child
{
  void print()
  {
    System.out.println("Child Class is Called");
  }
    public static void main(String args[])
    {
      Parent p=new Parent()
      {
        @Override
        void println()
        {
          System.out.println("Parent Class is Called");
          new Child().print();
        }
      };
      p.println();     
    }  
}  
