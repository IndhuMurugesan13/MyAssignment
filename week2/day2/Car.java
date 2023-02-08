package week2.day2;

public class Car {
	
	public static void main(String[] args) {
		
		//ClassName obj = new ClassName();
		Car obj = new Car();
		int numb=obj.getRegistratioNumber();
		System.out.println(numb);
				
		String ownername = obj.getOwnerName();
		System.out.println(ownername);
		
		obj.carModel();
		boolean punctured = obj.isPunctured();
		System.out.println(punctured);		
		int subtract=obj.subtractTwoNumbers(7, 4);
		System.out.println(subtract);
		int multiply=obj.multiplyThreeNumbers(2, 3, 4);
				System.out.println(multiply);
		int divide = obj.divideTwoNumbers(12,2);
				System.out.println(divide);
	}
	
	public int getRegistratioNumber()
	{
		int registrationNumber = 8790;
		return registrationNumber;
	}
		private String getOwnerName()
	{
		String name = "Sudhakar";
		return name;
	}
		void carModel() {
		System.out.println("Duster");
	}
		public boolean isPunctured()
	{
		return false;
	}
	public int subtractTwoNumbers(int num1,int num2)
	{
		return num1-num2;
		}
	public int multiplyThreeNumbers(int num1,int num2,int num3)
	{
			return num1*num2*num3;
	}
	public int divideTwoNumbers(int num1,int num2)
	{
			return num1/num2;
	}
	}