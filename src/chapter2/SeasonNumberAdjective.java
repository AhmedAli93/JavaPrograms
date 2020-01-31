package chapter2;

import java.util.Scanner;

public class SeasonNumberAdjective {

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

    }
}
