import java.util.Scanner;
public class Main {

    double FahrenheitToCelsius(double value){
        return ((value-32)/9)*5;
    }
    double CelsiusToFahrenheit(double value){
        return ((value/5)*9)+32;
    }
    double CelsiusToKelvin (Double value){
        return value+271.15;
    }
    double FahrenheitToKelvin (Double value){
        return ((value-32)/9)+273;
    }
    double KelvinToCelsius (double value){
        return value - 273;
    }
    double KelvinToFahrenheit (double value){
        return ((value-32)/9)*5 + 273.15;
    }
    public static void main(String[] args) {
        Main Convert = new Main();
        Scanner Input = new Scanner(System.in);
        System.out.println("Welcome to the temperature conversion system!\n" +
                "Please give us a number you want to convert: ");
        double value = Input.nextDouble();
        System.out.println("Please select one of them you'd like to convert: ");
        System.out.println("1.Celsius to Fahrenheit\n" + "2.Celsius to Kelvin\n" + "3.Fahrenheit to Celsius\n" + "4.Fahrenheit to Kelvin\n" + "5.Kelvin to Celsius\n " + "6.Kelvin to Fahrenheit");
        System.out.println("Your converted temperature is: ");
        int choice = Input.nextInt();
        switch (choice){
            case 1:
                System.out.println(Convert.CelsiusToFahrenheit(value));
            break;
            case 2:
                System.out.println(Convert.CelsiusToKelvin(value));
            break;
            case 3:
                System.out.println(Convert.FahrenheitToCelsius(value));
            break;
            case 4:
                System.out.println(Convert.FahrenheitToKelvin(value));
            break;
            case 5:
                System.out.println(Convert.KelvinToCelsius(value));
            break;
            case 6:
                System.out.println(Convert.KelvinToFahrenheit(value));
            default:
                System.out.println("Please select among the given numbers, Thanks You!");
        }
    }
}