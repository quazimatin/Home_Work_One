package homework2;



public class NonReturnType {
	
	// Non-Return Method
	// Non Return Method without Parameter:

	
	public static void main(String[] args) {
	
		NonReturnType.getName();
		NonReturnType.getAge();
		NonReturnType.getCountryInformation();
		NonReturnType.getProfessionalInformation();
		NonReturnType.getAddress();
		
		
		NonReturnType  WS= new NonReturnType();
	
		WS.getWeeklySalary(25, 40);
	
		WS.getinformation("Quazi", 40, 5164303447L);
		WS.doSumation(100, 250, 550);
		WS.doSubstraction(400, 125.25);
		WS.doMultification(625.50f, 100L);
	}
	
	public static void getName() {
		
		System.out.println("My Name is Quazi");
			
	}
	
	public static void getAge() {
		
		System.out.println("I am 40 yrs old");
		
	}

	public static void getCountryInformation() {
		
		System.out.println("I am from Bamgladesh");
		
	}
	
	public static void getProfessionalInformation() {
		
		String Profession= "IT Engineer";
		double Salary=120000.00;
		
	System.out.println("My Profession is: "+ Profession);
	System.out.print("Salary: "+Salary);
		
	}

	public static void getAddress() {
		
		String RoadName= "Person BLvd";
		String City= "Jamaica";	
	
		System.out.println("My Road Name is: "+ RoadName);
		System.out.print("City: "+City);
	
	}

	// Non-Return Method
	// Non Return Method with Parameter:

	public void getWeeklySalary(int PerHourRate, int PerHourWeekly) {
	
	int weeklySalary= PerHourRate*PerHourWeekly;
	

	System.out.println("My weeklysalary "+ weeklySalary);	
					
	}	
	

		public void getinformation(String Name, int Age, long PhoneNumber ) {
		
		
		System.out.println("Name: "+Name+ " " +"Age: "+Age+ " "+"My Phone Number: "+PhoneNumber);
		
	}
	
	public void doSumation(int Num1, int Num2, int Num3) {
		
		int Sum= Num1+Num2+Num3;
		
		System.out.println("Sumation: " +Sum);
		
	}
	
	public void doSubstraction(int Num1, double Num2)  {
		
		double Sub= Num1-Num2;
		
		System.out.println("Subtraction: " +Sub);
		
		
	}
	
	public void doMultification(float Num1, long Num2)  {
		
		float Mult= Num1*Num2;
		
		System.out.println("Multipication: " +Mult);
	}
	
	}	
	
	/**
	 * 
	 */
	


