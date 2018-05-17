package study.exceptioncalculator;

import java.util.Scanner;

public class UserExceptionCalculator {

  public static void main(String[] args) throws Exception {
    
    CalculatorException calculator=new CalculatorException();
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter two numbers :");
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
    System.out.println("Power Output :");
    System.out.println(calculator.calcutate(num1,num2));   
    scanner.close();
  }
}
