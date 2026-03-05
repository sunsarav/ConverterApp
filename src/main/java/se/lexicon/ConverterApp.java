package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ConverterApp {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" --- Converter App --- ");
            System.out.println(" 1. Length Converter ");
            System.out.println(" 2. BMI calculator");
            System.out.println(" 3. Weight Converter ");
            System.out.println(" 4. Exit ");
            System.out.println(" Choose an option: ");

            int choice = scanner.nextInt();
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();

            switch (choice) {
                case 1: //Length
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("1. m => km or 2. km => m: ");
                    int unit = scanner.nextInt();

                    if (unit == 1) {
                        System.out.println("Result: " + tokm(length) + "km");
                    } else {
                        System.out.println("Result: " + tom(length) + "m");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 2: //BMI
                    System.out.println("Enter weight (kg): ");
                    double weigh = scanner.nextDouble();
                    System.out.println("Enter height (m): ");
                    double height = scanner.nextDouble();

                    calculateBMI(weigh,height);

                    System.out.println("Converted at: " + currentDate +" " + currentTime);
                    break;

                case 3://Weight
                    System.out.println("Enter the value: ");
                    double weight = scanner.nextDouble();
                    System.out.println("1. kg to g, 2. g to kg: ");
                    int weightUnit = scanner.nextInt();

                    if (weightUnit == 1) {
                        System.out.println("Result: " + tokg(weight) + "kg");
                    } else {
                        System.out.println("Result: " + tog(weight) + "g");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 4://Exit
                    System.out.println("Exiting....Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Please enter a valid option (1-4)");
            }
        }
        scanner.close();
    }
    //Methods
        public static void calculateBMI(double weigh, double height) {
        double bmi = weigh / (height * height);

        //Using printf instead of println for decimal formatting to work
        // %.2f limits the result to 2 decimal places

        System.out.printf("Your BMI is: %.2f%n", bmi);

        //Category Logic
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Category: Over weight");
        }  else {
            System.out.println("Category: Obesity");
        }
        }
    public static double tokm(double m){
        return m / 1000.0;
    }
    public static double tom(double km){
        return km * 1000.0;
    }
    public static double tokg(double g){
        return g / 1000.0;
    }
    public static double tog(double kg){
        return kg * 1000.0;
    }

}






