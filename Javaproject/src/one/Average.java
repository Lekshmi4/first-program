package one;

public class Average {

	public static void main(String[] args) {
		Average.num(5,10,15);
		Average.num(5.1f,10.2f,15.3f);

	}
static void num(int a,int b,int c)
{int avg=(a+b+c)/3;
System.out.println("Average of Integer numbers is "+avg);
}
static void num(float a,float b,float c)
{float avg=(a+b+c)/3;
System.out.println("Average of Float numbers is "+avg);
}
}
