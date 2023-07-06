package one;

public class ThisDemo 
{
	int a;
	int b;
	ThisDemo()
	{
		System.out.println("Default Constructor");
	}
ThisDemo(int a,int b)
{
	this();
	this.a=a;
    this.b=b;
}
	public static void main(String[] args) {
		ThisDemo obj=new ThisDemo(1,2);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}

}
