/*class Demo
{
	void display()
	{
		System.out.println("Hey there");
	}
	protected void finalize()
	{
		System.out.println("hey in finalize method");
	}

}
class Main
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		d.display();
		d=null;
		System.gc();
	}
}*/
final class A {
    final int value = 10;

    final void display() {
        System.out.println("Value: " + value);
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
    }
}
