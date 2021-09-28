package homework;

import java.util.Scanner;

public class Home_Work_One {
	

		public static void calculator(){
			
		   System.out.println("Welcome to My Puzzle");
		   System.out.println("Please enter the first number");
		   Scanner quazi = new Scanner(System.in);
		   int firstNumber = quazi.nextInt();
		   System.out.println("Now enter the second number");
		   int secondNumber = quazi.nextInt();
		   int additionOfTwoNumber = firstNumber + secondNumber;
		   int subtractionOfTwoNumber = firstNumber - secondNumber;
		   int multiplicationOfTwoNumber = firstNumber * secondNumber;
		   int divisionOfTwoNumber = firstNumber / secondNumber;
		   System.out.println("addition of two number is " + additionOfTwoNumber);
		   System.out.println("subtraction of two number is " + subtractionOfTwoNumber);
		   System.out.println("multiplication of two number is " + multiplicationOfTwoNumber);
		   System.out.println("division of two number is " + divisionOfTwoNumber);
		   System.out.println("Thank you for Participating!");
		   quazi.close();
		}

		public static void main(String[] args) {
			Home_Work_One.calculator();

		}

		}



