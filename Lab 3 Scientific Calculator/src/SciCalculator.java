import java.util.Scanner;
import java.lang.Math;

public class SciCalculator {

    public static void menu(){ // method for menu output, menu();
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.println("");
        System.out.println("Enter Menu Selection: ");
    }

    public static void main(String[] args) {

        boolean sameCalc = false; // stops while loop if true
        float firstOp; // first Operand
        float secondOp; // second Operand
        float currentResult = 0; // current result of calculations
        float average; // average # of the calculations
        float sumCurrentResult = 0; // sum of the calculations
        int timesRan = 0; // times calculator has been ran
        int menuScan = 0; // scans menu input

        Scanner scnr = new Scanner(System.in);

        System.out.println("Current Result: " + currentResult); // outputs menu when program is ran for first time
        System.out.println("");
        menu();
        menuScan = scnr.nextInt();

        while (!sameCalc) { // keeps program running until sameCalc = true


        switch (menuScan) { // when input 0, exits program
            case 0:
                sameCalc = true;
                System.out.println("Thanks for using this calculator. Goodbye!");

                break;


            case 1: // when input 1, adds operands
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = firstOp + secondOp;
                System.out.print("Current Result: " + currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();


                break;

            case 2: // when input 2, subtracts operands
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = firstOp - secondOp;
                System.out.printf("Current Result: " + ("%.2f"), currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();

                break;

            case 3: // when input 3, multiplies operands
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = firstOp * secondOp;
                System.out.println("Current Result: " + currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();

                break;

            case 4: // when input 4, divides operands
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = firstOp / secondOp;
                System.out.println("Current Result: " + currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();

                break;

            case 5: // when input 5, first operand is used as base and second operand is used as exponent
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = (float) Math.pow(firstOp, secondOp);
                System.out.println("Current Result: " + currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();

                break;

            case 6: // when input 6, first operand is used as base and second operand is used as yield
                System.out.println("Enter first operand: ");
                firstOp = scnr.nextFloat();
                System.out.println("Enter second operand: ");
                secondOp = scnr.nextFloat();

                currentResult = (float) Math.log(secondOp) / (float) Math.log(firstOp);
                System.out.println("Current Result: " + currentResult);

                sumCurrentResult = currentResult + sumCurrentResult;

                timesRan++;

                System.out.println("");
                menu();
                System.out.println("");
                menuScan = scnr.nextInt();

                break;

            case 7: // When input 7 prints sum, number, and average of all calculations input
                // If no calculations are input when 7 is, prints error statement and restarts without menu
                if(timesRan == 0) {
                    System.out.println("Error: No calculations yet to average!");
                    System.out.println("");
                    System.out.println("Enter Menu Selection: ");
                    menuScan = scnr.nextInt();
                }
                else {
                    average = sumCurrentResult / timesRan;
                    System.out.printf("Sum of calculations: " + ("%.2f"), sumCurrentResult);
                    System.out.println("");
                    System.out.println("Number of calculations: " + timesRan);
                    System.out.printf("Average of calculations: " + ("%.2f"), average);


                    System.out.println("");
                    System.out.println("Enter Menu Selection: ");
                    menuScan = scnr.nextInt();




                }

                break;

            default: // when number that isn't between 0-7 is entered, this is output:
                System.out.println("Error: Invalid selection!");
                System.out.println("");
                System.out.println("Enter Menu Selection: ");
                menuScan = scnr.nextInt();

                break;



            }

        }

    }
}
