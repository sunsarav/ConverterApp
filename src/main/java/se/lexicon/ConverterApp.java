package se.lexicon;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ConverterApp {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println(" --- Converter App --- ");
            System.out.println(" 1. Data Storage Converter ");
            System.out.println(" 2. Length Converter ");
            System.out.println(" 3. BMI calculator");
            System.out.println(" 4. Weight Converter ");
            System.out.println(" 5. Exit ");
            System.out.println(" Choose an option: ");

            int choice = scanner.nextInt();
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();

            switch (choice) {
                case 1://Data Storage
                    System.out.println("Enter the amount of data: ");
                    double value = scanner.nextDouble();
                    System.out.println("1. KB => MB, 2. MB => GB, 3. GB => MB, 4. MB => KB ");
                    int type = scanner.nextInt();

                    if (type == 1) {
                        System.out.println("Result: " + ConverterLogic.kbToMb(value) + " MB ");
                    } else if (type == 2) {
                        System.out.println("Result: " + ConverterLogic.mbToGb(value) + " GB ");
                    } else if (type == 3) {
                        System.out.println("Result: " + ConverterLogic.gbToMb(value) + " MB ");
                    } else if (type == 4) {
                        System.out.println("Result: " + ConverterLogic.mbToKb(value) + " KB ");
                    } else {
                        System.out.println("Invalid entry");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 2: //Length
                    System.out.println("Enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.println("1. m => km or 2. km => m: ");
                    int unit = scanner.nextInt();

                    if (unit == 1) {
                        System.out.println("Result: " + ConverterLogic.tokm(length) + "km");
                    } else {
                        System.out.println("Result: " + ConverterLogic.tom(length) + "m");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 3: //BMI
                    System.out.println("Enter weight (kg): ");
                    double weigh = scanner.nextDouble();
                    System.out.println("Enter height in meters using comma: ");
                    double height = scanner.nextDouble();

                    double bmi = ConverterLogic.calculateBMI(weigh, height);
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
                    } else {
                        System.out.println("Category: Obesity");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 4://Weight
                    System.out.println("Enter the value: ");
                    double weight = scanner.nextDouble();
                    System.out.println("1. kg to g, 2. g to kg: ");
                    int weightUnit = scanner.nextInt();

                    if (weightUnit == 1) {
                        System.out.println("Result: " + ConverterLogic.tokg(weight) + "kg");
                    } else {
                        System.out.println("Result: " + ConverterLogic.tog(weight) + "g");
                    }
                    System.out.println("Converted at: " + currentDate + " " + currentTime);
                    break;

                case 5://Exit
                    System.out.println("Exiting....Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Please enter a valid option (1-5)");
            }
        }
        scanner.close();
    }
}













