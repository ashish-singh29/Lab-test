package labtest;

import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		Operation();

	}
	 public static void Operation() {
		    char operator;
		    Double num1, num2, result;

		    // an object of Scanner class for taking input from user.
		    Scanner input = new Scanner(System.in);

		    // input from user to enter operator.
		    System.out.println("Choose an operator: +, -, *, or /");
		    operator = input.next().charAt(0);

		    // input from user to enter numbers.
		    System.out.println("Enter first number");
		    num1 = input.nextDouble();

		    System.out.println("Enter second number");
		    num2 = input.nextDouble();

		    switch (operator) {

		      // addition between numbers
		      case '+':
		        result = num1 + num2;
		        System.out.println("Sum of Numbers=" + num1 + " + " + num2 + " = " + result);
		        break;

		      // subtraction between numbers
		      case '-':
		        result = num1 - num2;
		        System.out.println( "Substraction of Numbers=" + num1 + " - " + num2 + " = " + result);
		        break;

		      // multiplication between numbers
		      case '*':
		        result = num1 * num2;
		        System.out.println("Multiplication of Numbers=" + num1 + " * " + num2 + " = " + result);
		        break;

		      // division between numbers
		      case '/':
		        result = num1 / num2;
		        System.out.println("Division of Numbers=" + num1 + " / " + num2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator! inserted");
		        System.out.println("use Operators::+,-,*,/");
		        break;
		    }

  }
}