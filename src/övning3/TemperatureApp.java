package övning3;

public class TemperatureApp {
    static void main(String[] args) {
        TemperatureConverter temp1 = new TemperatureConverter(10,56);
        TemperatureConverter temp2 = new TemperatureConverter(32,100);
        TemperatureConverter temp3 = new TemperatureConverter(50,70);

        System.out.println("%.1f".formatted(temp1.tillCelsius()));
        System.out.println("%.1f".formatted(temp2.tillCelsius()));
        System.out.println("%.1f".formatted(temp3.tillCelsius()));

        System.out.println(temp1.tillFahrenheit());
        System.out.println(temp2.tillFahrenheit());
        System.out.println(temp3.tillFahrenheit());


    }
}
