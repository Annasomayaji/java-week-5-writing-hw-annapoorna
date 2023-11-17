package resources.calculator;

import resources.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner object
        Scanner scanner=new Scanner(System.in);
        String answer;
        do{
            System.out.println("Please enter first number: ");
            //input wizard
            int a=scanner.nextInt();
            System.out.println("PLease enter second number: ");
            //input wizard
            int b=scanner.nextInt();
            System.out.println("PLease enter one of the symbols +,-,*,/ : ");//.input wizard
            char symbol=scanner.next().charAt(0);
            Calculator calculator= new Calculator();
            calculator.calculateResult(a,b,symbol);
            System.out.println("Would you like to do more calculation? Please enter 'Y' or 'N': ");//Input wizard
            answer=scanner.next().toLowerCase();
        }while(answer.startsWith("y"));
        //closing scanner object
        scanner.close();
    }
}
