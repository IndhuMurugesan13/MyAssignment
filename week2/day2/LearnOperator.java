package week2.day2;

public class LearnOperator {
	public static void main(String[] args) {
		System.out.println(2+1);
		System.out.println(5-1);
		System.out.println(2*8);
		System.out.println(10/2);
		System.out.println(8/3);
		
		//Comparison Operator
		int a=5,b=7;
		if (a==b)
		{
			System.out.println("a=b");
		}else {
				System.out.println(a +"not=" +b);
		}
		
		//Logical Operators
		/* &&-AND
		|| OR
		!= NOT */
		int age = 22;
		if (age>18 && age<25) {
			System.out.println("Semi Adult");
		}
			int mark = 90;
			if (age > 18 || mark>80) {
				System.out.println("Admission Provided");
			}
			int i=1;
			System.out.println(i++);//post incremental operator
			System.out.println(i);
			int j=1;
			System.out.println(++j);//pre incremental operator
			int k=5;
			System.out.println(k--);//post decremental operator
			System.out.println(k);
			int l=5;
			System.out.println(--l);//pre decremental operator
			
			int age1= 56;
			System.out.println("My Age Is: " +age1);//concatenation operator
	}

}
