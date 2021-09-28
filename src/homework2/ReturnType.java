package homework2;

public class ReturnType {
	
	public static void main(String[] args) {
		
		
		
		ReturnType SM= new ReturnType();
		
		SM.doCalculation();
		SM.dosubtraction();
		SM.getMyInfo();
		SM.doMultipication();
		SM.getRent();
		
		SM.doSubstraction(475, 212);
		SM.getMultiplyValue(65, 40);
		ReturnType.doSumation(2500, 1850);
		SM.TestyPizzaAvailable("CheesePizza", 'L', 7.99);
		SM.getMonthlySalary(60000.00, 12);
	}
	

	
		
		// Return Method
		// Return Method without Parameter:
		
		
		
	public int doCalculation() {
		
		int Num1=50;
	    int Num2=100;
	    int Sum=Num1+Num2;
	    
	    System.out.println("Total Sunmation "+Sum);
		
		return Sum;
	}
	
	public int dosubtraction() {
		
		int Num1=150;
	    int Num2=100;
	    int Total=Num1-Num2;
	    
	    System.out.println("Total Sunmation "+Total);
		
	return Total;

}
	
	public String getMyInfo() {
		
		String name="Quazi";
		String CountryOfOrigin="Bangladesh";
		int age=40;
		double visaFee=1500.00;
		
		System.out.println("My Name : "+name+ " My CountryOfOrigin : "+CountryOfOrigin+  " My Age : "+age+ " Visa Fee : "+visaFee);
		
		return name;
	}
	
	public int doMultipication() {
		
		int salaryperhour=75;
	    int hourperweekly=40;
	    int Totalpayperweek=salaryperhour*hourperweekly;
	    
	    System.out.println("Total Salary Per Week "+Totalpayperweek);
		
		return Totalpayperweek;
	}
	
	
	public int getRent() {
		
		int monthlyrent=2500;
		int totalmonthofyear=12;
	    int totalyearlyrent=monthlyrent*totalmonthofyear;
	    
	    System.out.println("Total Yearly Rent "+totalyearlyrent);
		
		return totalyearlyrent;
	}
	
	
	
		
		// Return Method
		// Return Method with Parameter:
	
	public int doSubstraction(int Num1, int Num2) {
		
		int Sub=Num1-Num2;
	    
	    System.out.println("Total Sunmation "+Sub);
		
		return Sub;
	}
	
	
	public static int doSumation(int rent1, int rent2) {
		
		int rent=rent1+rent2;
	    
	    System.out.println("Total Sunmation "+rent);
		
		return rent;
	}
	
	
	public double getMultiplyValue(double num1, double num2) {
		
		double totalvalue=num1*num2;
		
		System.out.println("Total Output : "+totalvalue);
		
		return totalvalue;
	}
	
	public boolean TestyPizzaAvailable(String pizzaName, char size, double price) {
		
		char pizzaSize=size;
		double pizzaPrice=price;
		
		if (pizzaSize=='L') {
			
			System.out.println("Yes M size Pizza is avaialable");
			
		} else {
			
			System.out.println("No M size Pizza is not avaialable");
		}
		
		return pizzaSize=='M';
	}
	
	
	
	public double getMonthlySalary(double yearlysalary, int totalmonthofyear) {
		
		
		double monthlysalary=yearlysalary/totalmonthofyear;
		
		System.out.println("Total Monthly Salary : "+monthlysalary);
		
		return monthlysalary;
	}
	
	
	
	
	
		
	}

