package week2.day2;

public class LearnIfStatement {
	public static void main(String[] args) {
		int age = 21;
		
		//Check the condition for casting vote
		if (age>=18) {
		System.out.println("The Person can cast the vote");
	}
		else
		{
			System.out.println("The Person Is not allow to cast the vote");
			
		}
		
		int mark = 35;
				if(mark<=100 && mark>=80) {
					System.out.println("First Class");
				}else if(mark<80 && mark>=60) {
					System.out.println("Second Class");
				}

				else if(mark < 60 && mark>=35) {
					System.out.println("Third Class");
				}else {
					System.out.println("Re-Appear");
				}
	}
}

