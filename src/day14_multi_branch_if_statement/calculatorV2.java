package day14_multi_branch_if_statement;
import java.util.Scanner;
public class calculatorV2 {public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter 2 number");
    double num1=scan.nextDouble();
    double num2=scan.nextDouble();
    System.out.println("enter operator:- , + , * , /");
    char operator=scan.next().charAt(0);
    if(operator=='+'){
    }else if(operator=='-'){
        System.out.println(num1-num2);
    }else if(operator=='*'){
        System.out.println(num1*num2);
    }else if(operator=='/'){
        System.out.println(num1/num2);
    }else{
        System.out.println("great job");
    }

}
}

