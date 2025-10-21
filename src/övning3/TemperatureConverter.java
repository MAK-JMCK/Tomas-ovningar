package övning3;

//3. Class TemperatureConverter
//Skapa en klass TemperatureConverter som har metoder för att:
//        - omvandla Celsius till Fahrenheit
//- omvandla Fahrenheit till Celsius
//I en klass TemperatureApp, skapa flera instanser av TemperatureConverter för att konvertera olika temperaturer och skriv ut resultaten.

public class TemperatureConverter {
    private double celsius;
    private double fahrenheit;

    public TemperatureConverter(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double tillCelsius() {

        return (fahrenheit - 32) * (5.0 / 9.0);

    }

    public double tillFahrenheit() {

        return (celsius * 1.8) + 32;
    }
}
