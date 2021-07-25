import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---Welcome to the BMI Calculator---");
        int height, weight;
        double bmi;

        Scanner hei = new Scanner(System.in);
        System.out.print("Please enter your height in cm: ");
        height = hei.nextInt();
        Double heightM = Double.valueOf(height)/100;
        Scanner wei = new Scanner(System.in);
        System.out.print("Please enter your weight in kg: ");
        weight = wei.nextInt();
        bmi = weight / (heightM * heightM);
        System.out.println("Height: " + height + " cm - " + "Weight: " + weight + " kg");
        System.out.println("Your BMI: " + bmi);

        if (bmi<18.5) {
            System.out.println("You are at range of underweight.");
        }
        if (bmi>=18.5 && bmi<25) {
            System.out.println("You are at range of normal weight.");
        }
        if (bmi>=25 && bmi<30) {
            System.out.println("You are at range of overweight!");
        }
        if (bmi>30) {
            System.out.println("You are at range of OBESITY!!!");
        }

    }
}
