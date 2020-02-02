package Chapter3;

import java.util.Scanner;

public class ChangeGame {
    public static void main(String args[]){

        //Initialize what we know
        int dollar = 1;
        double quarter = .25;
        double dime = .10;
        double nickle = .05;
        double penny = .01;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your goal is to enter enough change to make exactly $1.00");

        //Get what we don't
        System.out.println("How many quarters would you like?");
        int numOfQuarters = scanner.nextInt();

        System.out.println("How many dimes would you like?");
        int numOfDime = scanner.nextInt();

        System.out.println("How many nickles would you like?");
        int numOfNickle = scanner.nextInt();

        System.out.println("How many pennies would you like?");
        int numOfPennies = scanner.nextInt();

        scanner.close();

        double total = numOfQuarters * quarter + numOfDime * dime + numOfNickle * nickle + numOfPennies * penny ;

        if(total == dollar){
            System.out.println("You win the game!");
        }
        else if(total > dollar){
                double moreThenDollar = total - dollar;
            System.out.println(total);
                System.out.println("It is more then a 1 dollar, this is how much you went over " + moreThenDollar);
            }
        else{
                double lessThanDollar = dollar - total;
                System.out.println("It is less than a 1 dollar, you were under by " + lessThanDollar);
            }

        }
}
