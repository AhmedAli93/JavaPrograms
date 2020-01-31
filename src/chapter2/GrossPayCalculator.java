package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String args[]){

        //1. Give me a season of the year
        System.out.println("What season of the year is it ?");
        Scanner scanner1 = new Scanner(System.in);
        String season = scanner1.next();

        //2. Give me a whole number
        System.out.println("Give me a whole number");
        int number = scanner1.nextInt();

        //3. Give me an adjective
        System.out.println("Give me an adjective");
        String adjective = scanner1.next();

        //4. Display sentence
        System.out.println("On a " +adjective+ " " +season+ " day, I drink a minimum of " +number+ " cups of coffee"  );

        /*
        // 1. Get Number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();


        // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();
        scanner.close();

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display results
        System.out.println("The employee's gross pay is $" + grossPay);

         */
    }
}
