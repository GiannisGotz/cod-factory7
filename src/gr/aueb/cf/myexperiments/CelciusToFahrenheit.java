package gr.aueb.cf.ch5;

import java.util.Scanner;

public class CelciusToFahrenheit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double T= 0;

        System.out.println("Please insert Celcius Temp:");
        T = scanner.nextDouble();
        System.out.println("Fahrenheit Temperature is: " +celciusToFahrenheit(T));
    }

    public static double celciusToFahrenheit (double T){
        return ( T * (9.0/5.0) ) + 32;
    }
}
