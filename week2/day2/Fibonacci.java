package week2.day2;

public class Fibonacci {
	
	public static void main(String[] args) {
		int num1 =0;
		int num2=1;
		int sum1=0;
		System.out.println(num1);
	
		for (int i=1;i<11;i++)
{
	sum1=num1+num2;
	num1=num2;
	num2=sum1;
	sum1=num1;
	System.out.println(num1);
}
	}
	

}
