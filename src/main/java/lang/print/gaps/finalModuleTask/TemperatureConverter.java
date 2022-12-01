package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(double temperatureCelsius) {

        System.out.println(((temperatureCelsius * 9) / 5) + 32);
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();
        converter.toFahrenheit(13);
    }
}
